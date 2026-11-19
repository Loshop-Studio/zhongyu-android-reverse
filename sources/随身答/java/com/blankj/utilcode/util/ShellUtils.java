package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import com.blankj.utilcode.util.Utils;
import java.util.List;

/* loaded from: classes3.dex */
public final class ShellUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");

    public static class CommandResult {
        public String errorMsg;
        public int result;
        public String successMsg;

        public CommandResult(int i9, String str, String str2) {
            this.result = i9;
            this.successMsg = str;
            this.errorMsg = str2;
        }

        public String toString() {
            return "result: " + this.result + "\nsuccessMsg: " + this.successMsg + "\nerrorMsg: " + this.errorMsg;
        }
    }

    private ShellUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static CommandResult execCmd(String str, boolean z9) {
        return execCmd(new String[]{str}, z9, true);
    }

    public static Utils.Task<CommandResult> execCmdAsync(String str, boolean z9, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(new String[]{str}, z9, true, consumer);
    }

    public static CommandResult execCmd(String str, List<String> list, boolean z9) {
        return execCmd(new String[]{str}, list == null ? null : (String[]) list.toArray(new String[0]), z9, true);
    }

    public static Utils.Task<CommandResult> execCmdAsync(List<String> list, boolean z9, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(list == null ? null : (String[]) list.toArray(new String[0]), z9, true, consumer);
    }

    public static Utils.Task<CommandResult> execCmdAsync(String[] strArr, boolean z9, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(strArr, z9, true, consumer);
    }

    public static Utils.Task<CommandResult> execCmdAsync(String str, boolean z9, boolean z10, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(new String[]{str}, z9, z10, consumer);
    }

    public static CommandResult execCmd(List<String> list, boolean z9) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z9, true);
    }

    public static Utils.Task<CommandResult> execCmdAsync(List<String> list, boolean z9, boolean z10, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(list == null ? null : (String[]) list.toArray(new String[0]), z9, z10, consumer);
    }

    public static CommandResult execCmd(List<String> list, List<String> list2, boolean z9) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), list2 != null ? (String[]) list2.toArray(new String[0]) : null, z9, true);
    }

    public static Utils.Task<CommandResult> execCmdAsync(final String[] strArr, final boolean z9, final boolean z10, @NonNull Utils.Consumer<CommandResult> consumer) {
        return UtilsBridge.doAsync(new Utils.Task<CommandResult>(consumer) { // from class: com.blankj.utilcode.util.ShellUtils.1
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public CommandResult doInBackground() {
                return ShellUtils.execCmd(strArr, z9, z10);
            }
        });
    }

    public static CommandResult execCmd(String[] strArr, boolean z9) {
        return execCmd(strArr, z9, true);
    }

    public static CommandResult execCmd(String str, boolean z9, boolean z10) {
        return execCmd(new String[]{str}, z9, z10);
    }

    public static CommandResult execCmd(String str, List<String> list, boolean z9, boolean z10) {
        return execCmd(new String[]{str}, list == null ? null : (String[]) list.toArray(new String[0]), z9, z10);
    }

    public static CommandResult execCmd(String str, String[] strArr, boolean z9, boolean z10) {
        return execCmd(new String[]{str}, strArr, z9, z10);
    }

    public static CommandResult execCmd(List<String> list, boolean z9, boolean z10) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z9, z10);
    }

    public static CommandResult execCmd(String[] strArr, boolean z9, boolean z10) {
        return execCmd(strArr, (String[]) null, z9, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.blankj.utilcode.util.ShellUtils.CommandResult execCmd(java.lang.String[] r8, java.lang.String[] r9, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.ShellUtils.execCmd(java.lang.String[], java.lang.String[], boolean, boolean):com.blankj.utilcode.util.ShellUtils$CommandResult");
    }
}
