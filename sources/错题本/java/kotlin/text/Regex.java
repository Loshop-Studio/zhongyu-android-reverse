package kotlin.text;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.feature.notebook.detail.C4898w4;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.C5803r;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p214z6.AbstractC6832j;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\u0018\u0000 A2\u00060\u0001j\u0002`\u0002:\u0002BCB\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018H\u0086\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J%\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b(\u0010!J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J)\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180.¢\u0006\u0004\b,\u00100J\u001d\u00101\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b1\u0010-J%\u00104\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u001d¢\u0006\u0004\b4\u00105J'\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\"2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u001dH\u0007¢\u0006\u0004\b6\u0010$J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0003¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b>\u00108R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006D"}, m5110d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Ld6/s;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "", "matches", "(Ljava/lang/CharSequence;)Z", "containsMatchIn", "", "startIndex", "Lkotlin/text/k;", "find", "(Ljava/lang/CharSequence;I)Lkotlin/text/k;", "Lz6/h;", "findAll", "(Ljava/lang/CharSequence;I)Lz6/h;", "matchEntire", "(Ljava/lang/CharSequence;)Lkotlin/text/k;", "index", "matchAt", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "(Ljava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "replaceFirst", "limit", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toString", "()Ljava/lang/String;", "toPattern", "()Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "_options", "Ljava/util/Set;", "getPattern", "getOptions", "()Ljava/util/Set;", "Companion", "Serialized", "kotlin/text/n", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n24#2,3:405\n1#3:408\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n105#1:405,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Regex implements Serializable {

    @NotNull
    public static final C5853n Companion = new C5853n();

    @Nullable
    private Set<? extends RegexOption> _options;

    @NotNull
    private final Pattern nativePattern;

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m5110d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "", "flags", "<init>", "(Ljava/lang/String;I)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "I", "getFlags", "()I", "Companion", "kotlin/text/o", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Serialized implements Serializable {

        @NotNull
        public static final C5854o Companion = new C5854o();
        private static final long serialVersionUID = 0;
        private final int flags;

        @NotNull
        private final String pattern;

        public Serialized(@NotNull String pattern, int i) {
            AbstractC5830k.m5330g(pattern, "pattern");
            this.pattern = pattern;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            AbstractC5830k.m5329f(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }
    }

    @Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: kotlin.text.Regex$findAll$2 */
    public static final /* synthetic */ class C58382 extends FunctionReferenceImpl implements InterfaceC6471c {
        public static final C58382 INSTANCE = new C58382();

        public C58382() {
            super(1, InterfaceC5850k.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // p152r6.InterfaceC6471c
        public final InterfaceC5850k invoke(InterfaceC5850k p0) {
            AbstractC5830k.m5330g(p0, "p0");
            return ((C5852m) p0).m5371b();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lz6/j;", "", "Ld6/s;", "<anonymous>", "(Lz6/j;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "kotlin.text.Regex$splitToSequence$1", m5303f = "Regex.kt", m5304i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m5305l = {280, 288, 292}, m5306m = "invokeSuspend", m5307n = {"$this$sequence", "matcher", "$this$sequence", "matcher", "nextStart", "splitCount", "$this$sequence", "matcher", "nextStart", "splitCount"}, m5308s = {"L$0", "L$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
    /* renamed from: kotlin.text.Regex$splitToSequence$1 */
    public static final class C58391 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C58391(CharSequence charSequence, int i, InterfaceC5631c<? super C58391> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$input = charSequence;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C58391 c58391 = Regex.this.new C58391(this.$input, this.$limit, interfaceC5631c);
            c58391.L$0 = obj;
            return c58391;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006c -> B:22:0x006d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.L$0
                z6.j r0 = (p214z6.AbstractC6832j) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r12.label
                d6.s r3 = p045d6.C5443s.f8405a
                r4 = 3
                r5 = 2
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L30
                if (r2 == r7) goto L16
                if (r2 == r5) goto L26
                if (r2 != r4) goto L1e
            L16:
                java.lang.Object r0 = r12.L$1
                java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
                kotlin.AbstractC5774b.m5119b(r13)
                return r3
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L26:
                int r2 = r12.I$1
                java.lang.Object r8 = r12.L$1
                java.util.regex.Matcher r8 = (java.util.regex.Matcher) r8
                kotlin.AbstractC5774b.m5119b(r13)
                goto L6d
            L30:
                kotlin.AbstractC5774b.m5119b(r13)
                kotlin.text.Regex r13 = kotlin.text.Regex.this
                java.util.regex.Pattern r13 = kotlin.text.Regex.access$getNativePattern$p(r13)
                java.lang.CharSequence r2 = r12.$input
                java.util.regex.Matcher r13 = r13.matcher(r2)
                int r2 = r12.$limit
                if (r2 == r7) goto La1
                boolean r2 = r13.find()
                if (r2 != 0) goto L4a
                goto La1
            L4a:
                r2 = 0
                r8 = r13
                r13 = r2
            L4d:
                java.lang.CharSequence r9 = r12.$input
                int r10 = r8.start()
                java.lang.CharSequence r9 = r9.subSequence(r2, r10)
                java.lang.String r9 = r9.toString()
                r12.L$0 = r0
                r12.L$1 = r8
                r12.I$0 = r2
                r12.I$1 = r13
                r12.label = r5
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = r0.mo6491a(r12, r9)
                if (r2 != r1) goto L6c
                goto Lb3
            L6c:
                r2 = r13
            L6d:
                int r13 = r8.end()
                int r2 = r2 + r7
                int r9 = r12.$limit
                int r9 = r9 - r7
                if (r2 == r9) goto L82
                boolean r9 = r8.find()
                if (r9 != 0) goto L7e
                goto L82
            L7e:
                r11 = r2
                r2 = r13
                r13 = r11
                goto L4d
            L82:
                java.lang.CharSequence r5 = r12.$input
                int r7 = r5.length()
                java.lang.CharSequence r5 = r5.subSequence(r13, r7)
                java.lang.String r5 = r5.toString()
                r12.L$0 = r6
                r12.L$1 = r6
                r12.I$0 = r13
                r12.I$1 = r2
                r12.label = r4
                kotlin.coroutines.intrinsics.CoroutineSingletons r13 = r0.mo6491a(r12, r5)
                if (r13 != r1) goto Lb4
                goto Lb3
            La1:
                java.lang.CharSequence r13 = r12.$input
                java.lang.String r13 = r13.toString()
                r12.L$0 = r6
                r12.L$1 = r6
                r12.label = r7
                kotlin.coroutines.intrinsics.CoroutineSingletons r13 = r0.mo6491a(r12, r13)
                if (r13 != r1) goto Lb4
            Lb3:
                return r1
            Lb4:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.C58391.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC6832j abstractC6832j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C58391) create(abstractC6832j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @PublishedApi
    public Regex(@NotNull Pattern nativePattern) {
        AbstractC5830k.m5330g(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ InterfaceC5850k find$default(Regex regex, CharSequence charSequence, int i, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ InterfaceC6830h findAll$default(Regex regex, CharSequence charSequence, int i, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ InterfaceC6830h splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        AbstractC5830k.m5329f(strPattern, "pattern(...)");
        return new Serialized(strPattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@NotNull CharSequence input) {
        AbstractC5830k.m5330g(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    @Nullable
    public final InterfaceC5850k find(@NotNull CharSequence input, int startIndex) {
        AbstractC5830k.m5330g(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        AbstractC5830k.m5329f(matcher, "matcher(...)");
        if (matcher.find(startIndex)) {
            return new C5852m(matcher, input);
        }
        return null;
    }

    @NotNull
    public final InterfaceC6830h findAll(@NotNull CharSequence input, int startIndex) {
        AbstractC5830k.m5330g(input, "input");
        if (startIndex < 0 || startIndex > input.length()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(startIndex, "Start index out of bounds: ", ", input length: ");
            sbM94s.append(input.length());
            throw new IndexOutOfBoundsException(sbM94s.toString());
        }
        C4898w4 c4898w4 = new C4898w4(this, input, startIndex);
        C58382 nextFunction = C58382.INSTANCE;
        AbstractC5830k.m5330g(nextFunction, "nextFunction");
        return new C5842c(c4898w4, nextFunction);
    }

    @NotNull
    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int iFlags = this.nativePattern.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        AbstractC5830k.m5327d(enumSetAllOf);
        Iterator it = enumSetAllOf.iterator();
        while (it.hasNext()) {
            InterfaceC5843d interfaceC5843d = (InterfaceC5843d) ((Enum) it.next());
            if (!((interfaceC5843d.getMask() & iFlags) == interfaceC5843d.getValue())) {
                it.remove();
            }
        }
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        AbstractC5830k.m5329f(setUnmodifiableSet, "unmodifiableSet(...)");
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @NotNull
    public final String getPattern() {
        String strPattern = this.nativePattern.pattern();
        AbstractC5830k.m5329f(strPattern, "pattern(...)");
        return strPattern;
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public final InterfaceC5850k matchAt(@NotNull CharSequence input, int index) {
        AbstractC5830k.m5330g(input, "input");
        Matcher matcherRegion = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        if (matcherRegion.lookingAt()) {
            return new C5852m(matcherRegion, input);
        }
        return null;
    }

    @Nullable
    public final InterfaceC5850k matchEntire(@NotNull CharSequence input) {
        AbstractC5830k.m5330g(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        AbstractC5830k.m5329f(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new C5852m(matcher, input);
        }
        return null;
    }

    public final boolean matches(@NotNull CharSequence input) {
        AbstractC5830k.m5330g(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public final boolean matchesAt(@NotNull CharSequence input, int index) {
        AbstractC5830k.m5330g(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt();
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        AbstractC5830k.m5330g(input, "input");
        AbstractC5830k.m5330g(replacement, "replacement");
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        AbstractC5830k.m5329f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence input, @NotNull String replacement) {
        AbstractC5830k.m5330g(input, "input");
        AbstractC5830k.m5330g(replacement, "replacement");
        String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        AbstractC5830k.m5329f(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    @NotNull
    public final List<String> split(@NotNull CharSequence input, int limit) {
        AbstractC5830k.m5330g(input, "input");
        AbstractC5855p.m5391Y(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return AbstractC5806u.m5286y(input.toString());
        }
        int i = 10;
        if (limit > 0 && limit <= 10) {
            i = limit;
        }
        ArrayList arrayList = new ArrayList(i);
        int i8 = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i8 >= 0 && arrayList.size() == i8) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @SinceKotlin(version = "1.6")
    @NotNull
    public final InterfaceC6830h splitToSequence(@NotNull CharSequence input, int limit) {
        AbstractC5830k.m5330g(input, "input");
        AbstractC5855p.m5391Y(limit);
        return new C5803r(new C58391(input, limit, null));
    }

    @NotNull
    /* renamed from: toPattern, reason: from getter */
    public final Pattern getNativePattern() {
        return this.nativePattern;
    }

    @NotNull
    public String toString() {
        String string = this.nativePattern.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull InterfaceC6471c transform) {
        AbstractC5830k.m5330g(input, "input");
        AbstractC5830k.m5330g(transform, "transform");
        int i = 0;
        Object objFind$default = find$default(this, input, 0, 2, null);
        if (objFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            C5852m c5852m = (C5852m) objFind$default;
            sb.append(input, i, c5852m.m5370a().f11420a);
            sb.append((CharSequence) transform.invoke(objFind$default));
            i = c5852m.m5370a().f11421b + 1;
            objFind$default = c5852m.m5371b();
            if (i >= length) {
                break;
            }
        } while (objFind$default != null);
        if (i < length) {
            sb.append(input, i, length);
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern) {
        AbstractC5830k.m5330g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC5830k.m5329f(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull RegexOption option) {
        AbstractC5830k.m5330g(pattern, "pattern");
        AbstractC5830k.m5330g(option, "option");
        C5853n c5853n = Companion;
        int value = option.getValue();
        c5853n.getClass();
        Pattern patternCompile = Pattern.compile(pattern, (value & 2) != 0 ? value | 64 : value);
        AbstractC5830k.m5329f(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull Set<? extends RegexOption> options) {
        AbstractC5830k.m5330g(pattern, "pattern");
        AbstractC5830k.m5330g(options, "options");
        C5853n c5853n = Companion;
        Iterator<T> it = options.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((InterfaceC5843d) it.next()).getValue();
        }
        c5853n.getClass();
        Pattern patternCompile = Pattern.compile(pattern, (value & 2) != 0 ? value | 64 : value);
        AbstractC5830k.m5329f(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
