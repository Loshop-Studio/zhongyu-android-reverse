package com.zykj.sketch.core.data;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.SketchHeader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes3.dex */
public final class BoardDataFactory {
    public static final Companion Companion = new Companion(null);
    private static int flag = 0;
    public static final int supportLastVersion = 2;
    public static final int version = 5;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EzyDrawBoard.ActionEnum.values().length];
                iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_START.ordinal()] = 1;
                iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final Iterable<EzyDrawBoard.ActionContent> deleteSnapShot(List<EzyDrawBoard.ActionContent> list) {
            setFlag(0);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BoardDataFactory.Companion.parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), arrayList);
            }
            return arrayList;
        }

        private final List<EzyDrawBoard.ActionContent> filterData(List<EzyDrawBoard.ActionContent> list) {
            List<EzyDrawBoard.ActionContent> listM14547X0 = AbstractC8778f0.m14547X0(list);
            ListIterator<EzyDrawBoard.ActionContent> listIterator = listM14547X0.listIterator();
            while (true) {
                boolean z10 = false;
                while (listIterator.hasNext()) {
                    EzyDrawBoard.ActionContent next = listIterator.next();
                    EzyDrawBoard.ActionEnum type = next.getType();
                    int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i10 == 1) {
                        z10 = true;
                    } else if (i10 != 2) {
                        if (!z10 && next.hasGraphSnapshot()) {
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
                return listM14547X0;
            }
        }

        private final void parseEventAsTask(EzyDrawBoard.ActionContent actionContent, List<EzyDrawBoard.ActionContent> list) {
            EzyDrawBoard.ActionContent.Builder builderNewBuilder = EzyDrawBoard.ActionContent.newBuilder();
            builderNewBuilder.setType(actionContent.getType());
            EzyDrawBoard.ActionEnum type = actionContent.getType();
            EzyDrawBoard.ActionEnum actionEnum = EzyDrawBoard.ActionEnum.ACTION_TOUCH;
            if (type == actionEnum) {
                builderNewBuilder.setResetData(actionContent.getResetData());
            }
            if (actionContent.hasGraphSnapshot() && (getFlag() == 0 || actionContent.getType() != actionEnum)) {
                System.out.println((Object) (builderNewBuilder.hasGraphSnapshot() + ' ' + getFlag() + "   " + actionContent.getType()));
                builderNewBuilder.setGraphSnapshot(actionContent.getGraphSnapshot());
                builderNewBuilder.setResetData(actionContent.getResetData());
                setFlag(getFlag() + 1);
            }
            builderNewBuilder.setAction(actionContent.getAction());
            StringBuilder sb = new StringBuilder();
            sb.append(builderNewBuilder.getType());
            sb.append(' ');
            sb.append(actionContent.hasGraphSnapshot());
            System.out.println((Object) sb.toString());
            EzyDrawBoard.ActionContent actionContentBuild = builderNewBuilder.build();
            AbstractC9133u.m16132f(actionContentBuild, "builder.build()");
            list.add(actionContentBuild);
        }

        public final EzyDrawBoard.DrawBoard buildCommon(List<EzyDrawBoard.ActionContent> data, EzyDrawBoard.BoardHead head) {
            AbstractC9133u.m16133g(data, "data");
            AbstractC9133u.m16133g(head, "head");
            EzyDrawBoard.BoardBody.Builder builderNewBuilder = EzyDrawBoard.BoardBody.newBuilder();
            builderNewBuilder.addAllActionContent(data);
            EzyDrawBoard.BoardBody boardBodyBuild = builderNewBuilder.build();
            EzyDrawBoard.DrawBoard.Builder builderNewBuilder2 = EzyDrawBoard.DrawBoard.newBuilder();
            builderNewBuilder2.setBoardHead(head);
            builderNewBuilder2.setBoardBody(boardBodyBuild);
            EzyDrawBoard.DrawBoard drawBoardBuild = builderNewBuilder2.build();
            AbstractC9133u.m16132f(drawBoardBuild, "drawBoard.build()");
            return drawBoardBuild;
        }

        public final EzyDrawBoard.BoardHead.Builder buildHead() {
            EzyDrawBoard.BoardHead.Builder header = EzyDrawBoard.BoardHead.newBuilder();
            header.setVersion(5);
            header.setType(1);
            header.setCreateDate(new Date().getTime());
            header.setAuthor("");
            AbstractC9133u.m16132f(header, "header");
            return header;
        }

        public final int getFlag() {
            return BoardDataFactory.flag;
        }

        public final List<EzyDrawBoard.ActionContent> parse(EzyDrawBoard.DrawBoard path) {
            AbstractC9133u.m16133g(path, "path");
            return path.getBoardBody().getActionContentList();
        }

        public final void setFlag(int i10) {
            BoardDataFactory.flag = i10;
        }

        private Companion() {
        }

        public final SketchHeader.Header buildCommon(EzyDrawBoard.BoardHead boardHead) {
            AbstractC9133u.m16133g(boardHead, "boardHead");
            SketchHeader.Header.Builder builderNewBuilder = SketchHeader.Header.newBuilder();
            builderNewBuilder.setVersion(boardHead.getVersion());
            builderNewBuilder.setWidth(boardHead.getWidth());
            builderNewBuilder.setHeight(boardHead.getHeight());
            builderNewBuilder.setCreateDate(boardHead.getCreateDate());
            builderNewBuilder.setUpdateDate(boardHead.getUpdateDate());
            builderNewBuilder.setAuthor(boardHead.getAuthor());
            builderNewBuilder.setType(builderNewBuilder.getType());
            SketchHeader.Header headerBuild = builderNewBuilder.build();
            AbstractC9133u.m16132f(headerBuild, "header.build()");
            return headerBuild;
        }
    }
}
