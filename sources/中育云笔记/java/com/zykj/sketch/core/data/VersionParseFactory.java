package com.zykj.sketch.core.data;

import android.graphics.Matrix;
import com.google.protobuf.CodedInputStream;
import com.zykj.sketch.EzyDrawBoard;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class VersionParseFactory {
    public static final Companion Companion = new Companion(null);
    private static int flag;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private final Matrix getFilterMatrix(float f10, int i10, int i11, int i12, int i13) {
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f10, i10, i11);
            matrix.postTranslate(i12, i13);
            return matrix;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x000e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.zykj.sketch.EzyDrawBoard.ActionContent parseActionContent(com.google.protobuf.CodedInputStream r9) {
            /*
                r8 = this;
                com.zykj.sketch.EzyDrawBoard$ActionContent$Builder r0 = com.zykj.sketch.EzyDrawBoard.ActionContent.newBuilder()
                com.google.protobuf.ExtensionRegistry r1 = com.google.protobuf.ExtensionRegistry.newInstance()
                com.zykj.sketch.EzyDrawBoard.registerAllExtensions(r1)
                r2 = 0
                r3 = 0
                r4 = r3
            Le:
                if (r2 != 0) goto L9c
                int r5 = r9.readTag()
                r6 = 1
                if (r5 == 0) goto L99
                r7 = 8
                if (r5 == r7) goto L8c
                r7 = 18
                if (r5 == r7) goto L7c
                r7 = 26
                if (r5 == r7) goto L38
                r6 = 42
                if (r5 == r6) goto L28
                goto Le
            L28:
                com.google.protobuf.Parser r5 = com.zykj.sketch.EzyDrawBoard.GraphResetData.parser()
                com.google.protobuf.MessageLite r5 = r9.readMessage(r5, r1)
                com.zykj.sketch.EzyDrawBoard$GraphResetData r5 = (com.zykj.sketch.EzyDrawBoard.GraphResetData) r5
                if (r5 == 0) goto Le
                r0.setResetData(r5)
                goto Le
            L38:
                int r5 = com.zykj.sketch.core.data.VersionParseFactory.access$getFlag$cp()
                if (r5 == 0) goto L5b
                if (r4 == 0) goto L45
                java.lang.String r5 = r4.getTypeUrl()
                goto L46
            L45:
                r5 = r3
            L46:
                java.lang.String r7 = "type.googleapis.com/ActionTouchEvent"
                boolean r5 = kotlin.jvm.internal.AbstractC9979u.m20289b(r5, r7)
                if (r5 == 0) goto L5b
                int r5 = com.zykj.sketch.core.data.VersionParseFactory.access$getFlag$cp()
                r7 = 50
                if (r5 != r7) goto L57
                goto L5b
            L57:
                r9.readByteArray()
                goto L68
            L5b:
                com.google.protobuf.Parser r5 = com.zykj.sketch.GraphSnapshot.GraphData.parser()
                com.google.protobuf.MessageLite r5 = r9.readMessage(r5, r1)
                com.zykj.sketch.GraphSnapshot$GraphData r5 = (com.zykj.sketch.GraphSnapshot.GraphData) r5
                r0.setGraphSnapshot(r5)
            L68:
                int r5 = com.zykj.sketch.core.data.VersionParseFactory.access$getFlag$cp()
                int r5 = r5 + r6
                com.zykj.sketch.core.data.VersionParseFactory.access$setFlag$cp(r5)
                int r5 = com.zykj.sketch.core.data.VersionParseFactory.access$getFlag$cp()
                r7 = 51
                if (r5 != r7) goto Le
                com.zykj.sketch.core.data.VersionParseFactory.access$setFlag$cp(r6)
                goto Le
            L7c:
                com.google.protobuf.Parser r4 = com.google.protobuf.Any.parser()
                com.google.protobuf.MessageLite r4 = r9.readMessage(r4, r1)
                com.google.protobuf.Any r4 = (com.google.protobuf.Any) r4
                if (r4 == 0) goto Le
                r0.setAction(r4)
                goto Le
            L8c:
                int r5 = r9.readEnum()
                com.zykj.sketch.EzyDrawBoard$ActionEnum r5 = com.zykj.sketch.EzyDrawBoard.ActionEnum.forNumber(r5)
                r0.setType(r5)
                goto Le
            L99:
                r2 = r6
                goto Le
            L9c:
                com.zykj.sketch.EzyDrawBoard$ActionContent r9 = r0.build()
                java.lang.String r0 = "newBuilder.build()"
                kotlin.jvm.internal.AbstractC9979u.m20293f(r9, r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.core.data.VersionParseFactory.Companion.parseActionContent(com.google.protobuf.CodedInputStream):com.zykj.sketch.EzyDrawBoard$ActionContent"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/VersionParseFactory$Companion.smali:75
        }

        private final void parseBody(EzyDrawBoard.DrawBoard.Builder builder, CodedInputStream codedInputStream) {
            EzyDrawBoard.BoardBody.Builder builderNewBuilder = EzyDrawBoard.BoardBody.newBuilder();
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            while (!z10) {
                int tag = codedInputStream.readTag();
                if (tag == 0) {
                    z10 = true;
                } else if (tag == 10) {
                    CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(codedInputStream.readByteArray());
                    AbstractC9979u.m20293f(codedInputStreamNewInstance, "newInstance(input.readByteArray())");
                    arrayList.add(parseActionContent(codedInputStreamNewInstance));
                }
            }
            builderNewBuilder.addAllActionContent(arrayList);
            builder.setBoardBody(builderNewBuilder.build());
        }

        private final EzyDrawBoard.DrawBoard parseDrawBoardData(CodedInputStream codedInputStream) {
            EzyDrawBoard.DrawBoard.Builder newBuilder = EzyDrawBoard.DrawBoard.newBuilder();
            boolean z10 = false;
            while (!z10) {
                int tag = codedInputStream.readTag();
                if (tag == 0) {
                    z10 = true;
                } else if (tag == 10) {
                    codedInputStream.readByteArray();
                } else if (tag == 18) {
                    AbstractC9979u.m20293f(newBuilder, "newBuilder");
                    CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(codedInputStream.readByteArray());
                    AbstractC9979u.m20293f(codedInputStreamNewInstance, "newInstance(input.readByteArray())");
                    parseBody(newBuilder, codedInputStreamNewInstance);
                }
            }
            EzyDrawBoard.DrawBoard drawBoardBuild = newBuilder.build();
            AbstractC9979u.m20293f(drawBoardBuild, "newBuilder.build()");
            return drawBoardBuild;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.zykj.sketch.EzyDrawBoard.ActionContent> parse(int r18, java.lang.String r19, com.zykj.sketch.EzyDrawBoard.BoardBody r20) {
            /*
                Method dump skipped, instructions count: 756
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.core.data.VersionParseFactory.Companion.parse(int, java.lang.String, com.zykj.sketch.EzyDrawBoard$BoardBody):java.util.List"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/VersionParseFactory$Companion.smali:687
        }

        private Companion() {
        }
    }
}
