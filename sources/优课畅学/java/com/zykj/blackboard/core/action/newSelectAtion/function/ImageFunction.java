package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.blankj.utilcode.util.AbstractC5380q;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.listener.ImageCropView;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyGraphEnum;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.CoroutineDispatcher;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes4.dex */
public final class ImageFunction extends BaseSelectFunction {
    private final ArrayList<RectF> funcRelativeRectFList;
    private final ArrayList<NewSelectFunctionType> functionTypeList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction(IActionListener listener) {
        super(listener);
        AbstractC9133u.m16133g(listener, "listener");
        this.functionTypeList = new ArrayList<>();
        this.funcRelativeRectFList = new ArrayList<>();
        initFunctionTypeList();
        initFunctionRelativeRectF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateFunctionRectF() {
        getSelectFunctionRectF().set(getMaxFunctionRectF());
        setDirectionLeft(getFunctionRectFBySelectRectF(getSelectFunctionRectF(), getSelectRectFAfterTransform(), getLimitRectFInPage()));
        updateFunctionRectF();
    }

    private final void initFunctionRelativeRectF() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float selectButtonHeight = (getBoardConfig().getSelectButtonHeight() - f10) / f11;
        float selectButtonHeight2 = ((getBoardConfig().getSelectButtonHeight() - f10) / f11) + f10;
        ArrayList<NewSelectFunctionType> arrayList = this.functionTypeList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((NewSelectFunctionType) obj).getText().length() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        float f12 = 23.0f;
        while (it.hasNext()) {
            float fMeasureText = paint.measureText(((NewSelectFunctionType) it.next()).getText());
            this.funcRelativeRectFList.add(new RectF(f12, selectButtonHeight, f12 + fMeasureText, selectButtonHeight2));
            f12 += fMeasureText + 30.0f;
        }
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        this.functionTypeList.add(NewSelectFunctionType.Rotate.INSTANCE);
        this.functionTypeList.add(NewSelectFunctionType.Scale.INSTANCE);
        this.functionTypeList.add(new NewSelectFunctionType.ImageCrop());
        this.functionTypeList.add(NewSelectFunctionType.Delete.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSingleSelectedRectF() {
        IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph != null) {
            getSelectRectF().set(iGraph.getOriginalRectF());
            Matrix transformMatrix = getTransformMatrix();
            transformMatrix.reset();
            transformMatrix.postConcat(iGraph.getRenderMatrix());
            transformMatrix.postConcat(getMatrixAdapter().getAdapterMatrix());
        }
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public List<NewSelectFunctionType> getCurrentFunctionTypeList() {
        return this.functionTypeList;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public RectF getMaxFunctionRectF() {
        return new RectF(0.0f, 0.0f, ((RectF) AbstractC8778f0.m14578x0(this.funcRelativeRectFList)).right + 15.0f + 8.0f, getBoardConfig().getSelectButtonHeight());
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float f10, float f11) {
        if (!super.handleClick(f10, f11)) {
            return false;
        }
        if (getCurrentFunctionMode() instanceof NewSelectFunctionMode.Function) {
            NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
            AbstractC9133u.m16131e(currentFunctionMode, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int index = ((NewSelectFunctionMode.Function) currentFunctionMode).getIndex();
            if (index == 0) {
                Object objM14566l0 = AbstractC8778f0.m14566l0(getSelectGraphList());
                AbstractC9133u.m16131e(objM14566l0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
                final ImageGraph imageGraph = (ImageGraph) objM14566l0;
                final String filePath = imageGraph.getFilePath();
                if (filePath == null) {
                    filePath = "";
                }
                ImageCropView imageCropView = getBoardConfig().getImageCropView();
                if (imageCropView != null) {
                    imageCropView.showCropView(filePath, new InterfaceC10570l() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction.handleClick.1

                        @InterfaceC9539d(m17800c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1", m17801f = "ImageFunction.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444}, m17803m = "invokeSuspend")
                        /* renamed from: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                            final /* synthetic */ String $cropFilePath;
                            final /* synthetic */ ImageGraph $graph;
                            final /* synthetic */ String $graphFilePath;
                            int label;
                            final /* synthetic */ ImageFunction this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ImageGraph imageGraph, String str, ImageFunction imageFunction, String str2, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                                super(2, interfaceC9324c);
                                this.$graph = imageGraph;
                                this.$graphFilePath = str;
                                this.this$0 = imageFunction;
                                this.$cropFilePath = str2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                                return new AnonymousClass1(this.$graph, this.$graphFilePath, this.this$0, this.$cropFilePath, interfaceC9324c);
                            }

                            @Override // p300x7.InterfaceC10574p
                            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                Object objM14848g;
                                Object objM17291f = AbstractC9434a.m17291f();
                                int i10 = this.label;
                                if (i10 == 0) {
                                    AbstractC9079b.m15926b(obj);
                                    CoroutineDispatcher coroutineDispatcherM14867b = C8843i0.m14867b();
                                    ImageFunction$handleClick$1$1$newFilePath$1 imageFunction$handleClick$1$1$newFilePath$1 = new ImageFunction$handleClick$1$1$newFilePath$1(this.$cropFilePath, this.$graphFilePath, null);
                                    this.label = 1;
                                    objM14848g = AbstractC8833f.m14848g(coroutineDispatcherM14867b, imageFunction$handleClick$1$1$newFilePath$1, this);
                                    if (objM14848g == objM17291f) {
                                        return objM17291f;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    AbstractC9079b.m15926b(obj);
                                    objM14848g = obj;
                                }
                                String newFilePath = (String) objM14848g;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                RectF originalRectF = this.$graph.getOriginalRectF();
                                BitmapFactory.decodeFile(this.$graphFilePath, options);
                                float fWidth = originalRectF.width() / options.outWidth;
                                Matrix renderMatrix = this.$graph.getRenderMatrix();
                                BitmapFactory.decodeFile(newFilePath, options);
                                RectF rectF = new RectF(0.0f, 0.0f, options.outWidth * fWidth, options.outHeight * fWidth);
                                Matrix matrix = new Matrix();
                                matrix.postTranslate(originalRectF.centerX() - rectF.centerX(), originalRectF.centerY() - rectF.centerY());
                                matrix.postConcat(renderMatrix);
                                IGraphControl graphControl = this.this$0.getGraphControl();
                                String id = this.$graph.getId();
                                AbstractC9133u.m16132f(newFilePath, "newFilePath");
                                graphControl.changeImageGraph(id, rectF, matrix, newFilePath);
                                this.this$0.updateSingleSelectedRectF();
                                this.this$0.calculateFunctionRectF();
                                BaseSelectFunction.showSelectRectF$default(this.this$0, false, 1, null);
                                IActionListener listener = this.this$0.getListener();
                                ImageGraph imageGraph = this.$graph;
                                EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.IMAGE_GRAPH;
                                String strSubstring = newFilePath.substring(AbstractC8661c0.m13996k0(newFilePath, File.separatorChar, 0, false, 6, null) + 1);
                                AbstractC9133u.m16132f(strSubstring, "this as java.lang.String).substring(startIndex)");
                                IActionListener.DefaultImpls.changeGraph$default(listener, imageGraph, graphEnum, rectF, null, null, null, matrix, strSubstring, 56, null);
                                this.this$0.getListener().saveSnapshot();
                                return C8736p.f16368a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p300x7.InterfaceC10570l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((String) obj);
                            return C8736p.f16368a;
                        }

                        public final void invoke(String cropFilePath) {
                            AbstractC9133u.m16133g(cropFilePath, "cropFilePath");
                            AbstractC5380q.m2623s("ImageFunction:Crop -> graphId: " + imageGraph.getId());
                            AbstractC8839h.m14861d(AbstractC9165e.m16553b(), null, null, new AnonymousClass1(imageGraph, filePath, this, cropFilePath, null), 3, null);
                        }
                    }, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction.handleClick.2
                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m27418invoke() {
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m27418invoke();
                            return C8736p.f16368a;
                        }
                    });
                }
            } else if (index == 1) {
                getGraphControl().delete(getSelectGraphList());
                getGraphControl().selectCancel();
                getListener().deleteGraphEvent(getSelectGraphList(), System.currentTimeMillis());
                getListener().saveSnapshot();
                reset();
            }
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean isClickInSelectFunction(float f10, float f11) {
        if (getFunctionRectF().getImageCrop().contains(f10, f11)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(0));
            return true;
        }
        if (getFunctionRectF().getDelete().contains(f10, f11)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(1));
            return true;
        }
        Matrix matrixInvert = MatrixExtKt.invert(getCurrentMatrix());
        float[] fArr = {f10, f11};
        matrixInvert.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth());
        float f14 = 2;
        float f15 = fMapRadius / f14;
        if (new RectF(getSelectRectF().centerX() - f15, getSelectRectF().top - ((5 * fMapRadius) / f14), getSelectRectF().centerX() + f15, getSelectRectF().top - ((fMapRadius * 3) / f14)).contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Rotate.INSTANCE);
            return true;
        }
        if (new RectF(getSelectRectF().right - f15, getSelectRectF().bottom - f15, getSelectRectF().right + f15, getSelectRectF().bottom + f15).contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Scale.INSTANCE);
            return true;
        }
        if (getSelectRectF().contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Content.INSTANCE);
            return true;
        }
        setCurrentFunctionMode(NewSelectFunctionMode.Nothing.INSTANCE);
        return false;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void reset() {
        super.reset();
        initFunctionTypeList();
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        FunctionRectF functionRectF = getFunctionRectF();
        functionRectF.getImageCrop().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
        functionRectF.getDelete().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
        if (isDirectionLeft()) {
            return;
        }
        float f10 = (functionRectF.getDelete().right - functionRectF.getImageCrop().left) + 16.0f;
        functionRectF.getImageCrop().offset(getSelectFunctionRectF().width() - f10, 0.0f);
        functionRectF.getDelete().offset(getSelectFunctionRectF().width() - f10, 0.0f);
    }
}
