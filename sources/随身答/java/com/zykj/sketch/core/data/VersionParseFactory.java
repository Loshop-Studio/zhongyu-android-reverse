package com.zykj.sketch.core.data;

import android.graphics.Matrix;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.CodedInputStream;
import com.zykj.sketch.EzyDrawBoard;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/sketch/core/data/VersionParseFactory;", "", "()V", "Companion", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class VersionParseFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int flag;

    @Metadata(m13412d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m13413d2 = {"Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;", "", "()V", "flag", "", "getFilterMatrix", "Landroid/graphics/Matrix;", "scale", "", "centerX", "centerY", "px", "py", "parse", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "versionCode", "path", "", "body", "Lcom/zykj/sketch/EzyDrawBoard$BoardBody;", "parseActionContent", "input", "Lcom/google/protobuf/CodedInputStream;", "parseBody", "", "drawBoard", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;", "parseDrawBoardData", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Matrix getFilterMatrix(float scale, int centerX, int centerY, int px, int py) {
            Matrix matrix = new Matrix();
            matrix.setScale(scale, scale, centerX, centerY);
            matrix.postTranslate(px, py);
            return matrix;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x000e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.zykj.sketch.EzyDrawBoard.ActionContent parseActionContent(com.google.protobuf.CodedInputStream r9) throws java.io.IOException {
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
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)
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
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.core.data.VersionParseFactory.Companion.parseActionContent(com.google.protobuf.CodedInputStream):com.zykj.sketch.EzyDrawBoard$ActionContent"); // DEX body: android/随身答/smali_classes5/com/zykj/sketch/core/data/VersionParseFactory$Companion.smali:121
        }

        private final void parseBody(EzyDrawBoard.DrawBoard.Builder drawBoard, CodedInputStream input) throws IOException {
            EzyDrawBoard.BoardBody.Builder builderNewBuilder = EzyDrawBoard.BoardBody.newBuilder();
            ArrayList arrayList = new ArrayList();
            boolean z9 = false;
            while (!z9) {
                int tag = input.readTag();
                if (tag == 0) {
                    z9 = true;
                } else if (tag == 10) {
                    CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(input.readByteArray());
                    Intrinsics.checkNotNullExpressionValue(codedInputStreamNewInstance, "newInstance(input.readByteArray())");
                    arrayList.add(parseActionContent(codedInputStreamNewInstance));
                }
            }
            builderNewBuilder.addAllActionContent(arrayList);
            drawBoard.setBoardBody(builderNewBuilder.build());
        }

        private final EzyDrawBoard.DrawBoard parseDrawBoardData(CodedInputStream input) throws IOException {
            EzyDrawBoard.DrawBoard.Builder newBuilder = EzyDrawBoard.DrawBoard.newBuilder();
            boolean z9 = false;
            while (!z9) {
                int tag = input.readTag();
                if (tag == 0) {
                    z9 = true;
                } else if (tag == 10) {
                    input.readByteArray();
                } else if (tag == 18) {
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder");
                    CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(input.readByteArray());
                    Intrinsics.checkNotNullExpressionValue(codedInputStreamNewInstance, "newInstance(input.readByteArray())");
                    parseBody(newBuilder, codedInputStreamNewInstance);
                }
            }
            EzyDrawBoard.DrawBoard drawBoardBuild = newBuilder.build();
            Intrinsics.checkNotNullExpressionValue(drawBoardBuild, "newBuilder.build()");
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
        /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.zykj.sketch.EzyDrawBoard.ActionContent> parse(int r18, java.lang.String r19, com.zykj.sketch.EzyDrawBoard.BoardBody r20) {
            /*
                Method dump skipped, instructions count: 750
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.core.data.VersionParseFactory.Companion.parse(int, java.lang.String, com.zykj.sketch.EzyDrawBoard$BoardBody):java.util.List"); // DEX body: android/随身答/smali_classes5/com/zykj/sketch/core/data/VersionParseFactory$Companion.smali:733
        }

        private Companion() {
        }
    }
}
