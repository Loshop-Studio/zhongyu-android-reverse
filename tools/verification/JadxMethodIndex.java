import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jadx.api.JadxDecompiler;
import jadx.api.impl.AnnotatedCodeWriter;
import jadx.cli.JadxCLIArgs;
import jadx.core.dex.nodes.ClassNode;
import jadx.core.dex.nodes.MethodNode;
import jadx.core.utils.Utils;

/** Match the display signatures emitted by JADX 1.5.3 MethodGen to original DEX records. */
public class JadxMethodIndex {
    private static final String STUB = "throw new UnsupportedOperationException(\"Method not decompiled: ";

    private static String prototype(MethodNode method) {
        var info = method.getMethodInfo();
        return "(" + Utils.listToString(info.getArgumentsTypes()) + "):" + info.getReturnType();
    }

    private static void write(BufferedWriter out, String display, MethodNode method) throws Exception {
        out.write(String.join("\t", display, method.getParentClass().getClassInfo().getRawName(),
            method.getMethodInfo().getShortId()));
        out.newLine();
    }

    public static void main(String[] args) throws Exception {
        Path output = Path.of(args[3]).toAbsolutePath();
        Path generated = Files.createTempFile(output.getParent(), "jadx-generated-", ".jobf");
        Map<String, Set<String>> owners = new HashMap<>();
        Map<String, Set<String>> spellings = new HashMap<>();
        Map<String, String> rawOwners = new HashMap<>();
        for (String row : Files.readAllLines(Path.of(args[2]))) {
            String[] parts = row.split("\t", -1);
            String signature = parts[0];
            Set<String> names = owners.computeIfAbsent(signature, key -> new HashSet<>());
            names.add(parts[1]);
            if (!parts[2].isEmpty()) names.add(parts[2]);
            int argsAt = signature.indexOf('(');
            int nameAt = signature.lastIndexOf('.', argsAt) + 1;
            Set<String> keys = new HashSet<>();
            keys.add(signature);
            if (!parts[3].isEmpty()) {
                String raw = signature.substring(0, nameAt) + parts[3] + signature.substring(argsAt);
                keys.add(raw);
            }
            boolean renamedTop = !parts[2].isEmpty() && signature.substring(0, nameAt - 1).equals(parts[1]);
            if (renamedTop) rawOwners.put(signature, parts[2]);
            for (String key : keys) {
                spellings.computeIfAbsent(key, k -> new HashSet<>()).add(signature);
                if (renamedTop) {
                    String original = parts[2] + key.substring(parts[1].length());
                    spellings.computeIfAbsent(original, k -> new HashSet<>()).add(signature);
                }
            }
        }
        Set<String> found = new HashSet<>();
        try {
            // Recreate the naming pass used for the source export. In 1.5.3, reading
            // a saved JOBF can give the same class a different package.
            var cli = new JadxCLIArgs();
            if (!cli.processArgs(new String[]{"--log-level", "warn", "-r", "-j", "3", "--deobf",
                    "--deobf-cfg-file", generated.toString(), "--deobf-cfg-file-mode", "overwrite", args[0]})) {
                throw new IllegalArgumentException("Invalid JADX options");
            }
            var options = cli.toJadxArgs();
            options.setCodeWriterProvider(AnnotatedCodeWriter::new);
            try (var jadx = new JadxDecompiler(options); BufferedWriter out = Files.newBufferedWriter(output)) {
                jadx.load();
                if (Files.mismatch(generated, Path.of(args[1])) != -1) {
                    throw new IllegalStateException("Recomputed aliases differ from the supplied JOBF");
                }
                for (ClassNode cls : jadx.getRoot().getClasses()) {
                    String owner = cls.getClassInfo().getAliasFullName() + ".";
                    for (MethodNode method : cls.getMethods()) {
                        String proto = prototype(method);
                        for (String name : new String[]{method.getAlias(), method.getMethodInfo().getName()}) {
                            var matches = spellings.get(owner + name + proto);
                            if (matches == null) continue;
                            for (String display : matches) {
                                String requiredOwner = rawOwners.get(display);
                                if (requiredOwner != null && !requiredOwner.equals(cls.getClassInfo().getRawName())) continue;
                                write(out, display, method);
                                found.add(display);
                            }
                        }
                    }
                }
                // Kotlin source aliases and inlined anonymous methods can change
                // during code generation. Re-read just the affected source files.
                Set<String> remaining = new HashSet<>(owners.keySet());
                remaining.removeAll(found);
                Set<String> sources = new HashSet<>();
                remaining.forEach(sig -> sources.addAll(owners.get(sig)));
                for (ClassNode cls : jadx.getRoot().getClasses()) {
                    var type = cls.getClassInfo();
                    if (!sources.contains(type.getRawName()) && !sources.contains(type.getAliasFullName())) continue;
                    var code = cls.getTopParentClass().decompile();
                    String source = code.getCodeStr();
                    int pos = source.indexOf(STUB);
                    while (pos != -1) {
                        int begin = pos + STUB.length();
                        String signature = source.substring(begin, source.indexOf("\");", begin));
                        if (remaining.contains(signature) && code.getCodeMetadata().getNodeAt(pos) instanceof MethodNode node) {
                            // A typed body can be inlined into a generic bridge. The
                            // declaration at this point may have the wrong return type.
                            if (signature.endsWith(prototype(node))) write(out, signature, node);
                        }
                        pos = source.indexOf(STUB, begin);
                    }
                }
            }
        } finally {
            Files.deleteIfExists(generated);
        }
    }
}
