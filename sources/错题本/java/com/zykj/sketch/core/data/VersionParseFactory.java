package com.zykj.sketch.core.data;

import android.graphics.Matrix;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.CodedInputStream;
import com.zykj.sketch.EzyDrawBoard;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/sketch/core/data/VersionParseFactory;", "", "()V", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class VersionParseFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int flag;

    @Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0 2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m5110d2 = {"Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;", "", "<init>", "()V", "Lcom/google/protobuf/CodedInputStream;", "input", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "parseDrawBoardData", "(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;", "drawBoard", "Ld6/s;", "parseBody", "(Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;Lcom/google/protobuf/CodedInputStream;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "parseActionContent", "(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "", "scale", "", "centerX", "centerY", "px", "py", "Landroid/graphics/Matrix;", "getFilterMatrix", "(FIIII)Landroid/graphics/Matrix;", "versionCode", "", "path", "Lcom/zykj/sketch/EzyDrawBoard$BoardBody;", "body", "", "parse", "(ILjava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Ljava/util/List;", "flag", "I", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
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
                boolean r5 = kotlin.jvm.internal.AbstractC5830k.m5325b(r5, r7)
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
                kotlin.jvm.internal.AbstractC5830k.m5329f(r9, r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.core.data.VersionParseFactory.Companion.parseActionContent(com.google.protobuf.CodedInputStream):com.zykj.sketch.EzyDrawBoard$ActionContent"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/core/data/VersionParseFactory$Companion.smali:128
        }

        private final void parseBody(EzyDrawBoard.DrawBoard.Builder drawBoard, CodedInputStream input) throws IOException {
            EzyDrawBoard.BoardBody.Builder builderNewBuilder = EzyDrawBoard.BoardBody.newBuilder();
            ArrayList arrayList = new ArrayList();
            boolean z8 = false;
            while (!z8) {
                int tag = input.readTag();
                if (tag == 0) {
                    z8 = true;
                } else if (tag == 10) {
                    CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(input.readByteArray());
                    AbstractC5830k.m5329f(codedInputStreamNewInstance, "newInstance(input.readByteArray())");
                    arrayList.add(parseActionContent(codedInputStreamNewInstance));
                }
            }
            builderNewBuilder.addAllActionContent(arrayList);
            drawBoard.setBoardBody(builderNewBuilder.build());
        }

        private final EzyDrawBoard.DrawBoard parseDrawBoardData(CodedInputStream input) throws IOException {
            EzyDrawBoard.DrawBoard.Builder newBuilder = EzyDrawBoard.DrawBoard.newBuilder();
            boolean z8 = false;
            while (!z8) {
                int tag = input.readTag();
                if (tag == 0) {
                    z8 = true;
                } else if (tag == 10) {
                    input.readByteArray();
                } else if (tag == 18) {
                    AbstractC5830k.m5329f(newBuilder, "newBuilder");
                    CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(input.readByteArray());
                    AbstractC5830k.m5329f(codedInputStreamNewInstance, "newInstance(input.readByteArray())");
                    parseBody(newBuilder, codedInputStreamNewInstance);
                }
            }
            EzyDrawBoard.DrawBoard drawBoardBuild = newBuilder.build();
            AbstractC5830k.m5329f(drawBoardBuild, "newBuilder.build()");
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
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.zykj.sketch.EzyDrawBoard.ActionContent> parse(int r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull com.zykj.sketch.EzyDrawBoard.BoardBody r20) {
            /*
                Method dump skipped, instructions count: 752
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.core.data.VersionParseFactory.Companion.parse(int, java.lang.String, com.zykj.sketch.EzyDrawBoard$BoardBody):java.util.List"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/core/data/VersionParseFactory$Companion.smali:740
        }

        private Companion() {
        }
    }
}
