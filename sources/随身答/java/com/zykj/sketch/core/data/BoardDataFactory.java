package com.zykj.sketch.core.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.SketchHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/sketch/core/data/BoardDataFactory;", "", "()V", "Companion", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class BoardDataFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int flag = 0;
    public static final int supportLastVersion = 2;
    public static final int version = 5;

    @Metadata(m13412d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000b\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u000fJ\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, m13413d2 = {"Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;", "", "()V", "flag", "", "getFlag", "()I", "setFlag", "(I)V", "supportLastVersion", "version", "buildCommon", "Lcom/zykj/sketch/SketchHeader$Header;", "boardHead", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead;", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "data", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "head", "buildHead", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;", "deleteSnapShot", "", "filterData", "list", "parse", "path", "parseEventAsTask", "", "content", "newContentList", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {

        @Metadata(m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EzyDrawBoard.ActionEnum.values().length];
                iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_START.ordinal()] = 1;
                iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Iterable<EzyDrawBoard.ActionContent> deleteSnapShot(List<EzyDrawBoard.ActionContent> filterData) {
            setFlag(0);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = filterData.iterator();
            while (it.hasNext()) {
                BoardDataFactory.INSTANCE.parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), arrayList);
            }
            return arrayList;
        }

        private final List<EzyDrawBoard.ActionContent> filterData(List<EzyDrawBoard.ActionContent> list) {
            List<EzyDrawBoard.ActionContent> mutableList = CollectionsKt.toMutableList((Collection) list);
            ListIterator<EzyDrawBoard.ActionContent> listIterator = mutableList.listIterator();
            while (true) {
                boolean z9 = false;
                while (listIterator.hasNext()) {
                    EzyDrawBoard.ActionContent next = listIterator.next();
                    EzyDrawBoard.ActionEnum type = next.getType();
                    int i9 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i9 == 1) {
                        z9 = true;
                    } else if (i9 != 2) {
                        if (!z9 && next.hasGraphSnapshot()) {
                            if (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                if (listIterator.previous().getType() != EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP) {
                                    listIterator.remove();
                                } else {
                                    if (listIterator.hasNext()) {
                                        listIterator.next();
                                    }
                                    if (listIterator.hasNext()) {
                                        listIterator.next();
                                    }
                                }
                            }
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                        }
                    }
                }
                return mutableList;
            }
        }

        private final void parseEventAsTask(EzyDrawBoard.ActionContent content, List<EzyDrawBoard.ActionContent> newContentList) {
            EzyDrawBoard.ActionContent.Builder builderNewBuilder = EzyDrawBoard.ActionContent.newBuilder();
            builderNewBuilder.setType(content.getType());
            EzyDrawBoard.ActionEnum type = content.getType();
            EzyDrawBoard.ActionEnum actionEnum = EzyDrawBoard.ActionEnum.ACTION_TOUCH;
            if (type == actionEnum) {
                builderNewBuilder.setResetData(content.getResetData());
            }
            if (content.hasGraphSnapshot() && (getFlag() == 0 || content.getType() != actionEnum)) {
                System.out.println((Object) (builderNewBuilder.hasGraphSnapshot() + ' ' + getFlag() + "   " + content.getType()));
                builderNewBuilder.setGraphSnapshot(content.getGraphSnapshot());
                builderNewBuilder.setResetData(content.getResetData());
                setFlag(getFlag() + 1);
            }
            builderNewBuilder.setAction(content.getAction());
            StringBuilder sb = new StringBuilder();
            sb.append(builderNewBuilder.getType());
            sb.append(' ');
            sb.append(content.hasGraphSnapshot());
            System.out.println((Object) sb.toString());
            EzyDrawBoard.ActionContent actionContentBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(actionContentBuild, "builder.build()");
            newContentList.add(actionContentBuild);
        }

        public final EzyDrawBoard.DrawBoard buildCommon(List<EzyDrawBoard.ActionContent> data, EzyDrawBoard.BoardHead head) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(head, "head");
            EzyDrawBoard.BoardBody.Builder builderNewBuilder = EzyDrawBoard.BoardBody.newBuilder();
            builderNewBuilder.addAllActionContent(data);
            EzyDrawBoard.BoardBody boardBodyBuild = builderNewBuilder.build();
            EzyDrawBoard.DrawBoard.Builder builderNewBuilder2 = EzyDrawBoard.DrawBoard.newBuilder();
            builderNewBuilder2.setBoardHead(head);
            builderNewBuilder2.setBoardBody(boardBodyBuild);
            EzyDrawBoard.DrawBoard drawBoardBuild = builderNewBuilder2.build();
            Intrinsics.checkNotNullExpressionValue(drawBoardBuild, "drawBoard.build()");
            return drawBoardBuild;
        }

        public final EzyDrawBoard.BoardHead.Builder buildHead() {
            EzyDrawBoard.BoardHead.Builder header = EzyDrawBoard.BoardHead.newBuilder();
            header.setVersion(5);
            header.setType(1);
            header.setCreateDate(new Date().getTime());
            header.setAuthor("");
            Intrinsics.checkNotNullExpressionValue(header, "header");
            return header;
        }

        public final int getFlag() {
            return BoardDataFactory.flag;
        }

        public final List<EzyDrawBoard.ActionContent> parse(EzyDrawBoard.DrawBoard path) {
            Intrinsics.checkNotNullParameter(path, "path");
            return path.getBoardBody().getActionContentList();
        }

        public final void setFlag(int i9) {
            BoardDataFactory.flag = i9;
        }

        private Companion() {
        }

        public final SketchHeader.Header buildCommon(EzyDrawBoard.BoardHead boardHead) {
            Intrinsics.checkNotNullParameter(boardHead, "boardHead");
            SketchHeader.Header.Builder builderNewBuilder = SketchHeader.Header.newBuilder();
            builderNewBuilder.setVersion(boardHead.getVersion());
            builderNewBuilder.setWidth(boardHead.getWidth());
            builderNewBuilder.setHeight(boardHead.getHeight());
            builderNewBuilder.setCreateDate(boardHead.getCreateDate());
            builderNewBuilder.setUpdateDate(boardHead.getUpdateDate());
            builderNewBuilder.setAuthor(boardHead.getAuthor());
            builderNewBuilder.setType(builderNewBuilder.getType());
            SketchHeader.Header headerBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(headerBuild, "header.build()");
            return headerBuild;
        }
    }
}
