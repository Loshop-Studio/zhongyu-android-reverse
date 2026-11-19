package com.zykj.blackboard.core.edit;

// RE note 管理 Blackboard 页面编辑状态及页面快照。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.action.AbstractC6626b;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.blackboard.utils.OutOfMaxImageCountException;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p035c5.InterfaceC5119b;
import p035c5.InterfaceC5120c;
import p035c5.InterfaceC5121d;
import p035c5.InterfaceC5122e;
import p035c5.InterfaceC5123f;
import p035c5.InterfaceC5124g;
import p035c5.InterfaceC5126i;
import p035c5.InterfaceC5127j;
import p077e5.AbstractC7345f;
import p077e5.AbstractC7351l;
import p077e5.AbstractC7352m;
import p077e5.C7347h;
import p077e5.C7358s;
import p098g4.InterfaceC7523c;
import p142k4.C7879b;
import p155l4.C8505j;
import p177n4.AbstractC8630j;
import p177n4.C8627g;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p221r4.C9008d;
import p285x4.C9850c;
import p285x4.InterfaceC9849b;

/* loaded from: classes4.dex */
public final class PageControl extends BasePageControl {
    public /* synthetic */ PageControl(BoardControl boardControl, C8505j c8505j, PageEntity pageEntity, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(boardControl, c8505j, (i10 & 4) != 0 ? null : pageEntity);
    }

    /* renamed from: j0 */
    public static /* synthetic */ ImageGraph m6702j0(PageControl pageControl, File file, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, boolean z9, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        if ((i10 & 32) != 0) {
            z9 = false;
        }
        return pageControl.m6717i0(file, positionEnum, scaleTypeEnum, num, num2, z9);
    }

    /* renamed from: l0 */
    public static /* synthetic */ ImageGraph m6703l0(PageControl pageControl, String str, String str2, float f10, float f11, Matrix matrix, boolean z9, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z9 = false;
        }
        return pageControl.m6720k0(str, str2, f10, f11, matrix, z9);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: A */
    public ImageGraph mo6704A(String path) throws Throwable {
        String strM6899b;
        Intrinsics.checkNotNullParameter(path, "path");
        if (mo6734y() >= m6660N().getConfig().getMaxImageSize()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM14219i = AbstractC8630j.m14219i(this, path);
        if (fileM14219i == null || (strM6899b = FileValidateUtils.m6899b(FileValidateUtils.f7853a, fileM14219i, null, 2, null)) == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        if (m6661O().mo13449n() == null) {
            return null;
        }
        String name = fileM14219i.getName();
        Intrinsics.checkNotNullExpressionValue(name, "newFile.name");
        Matrix matrixM6723m0 = m6723m0(f10, f11);
        matrixM6723m0.postConcat(m6663Q().m13190d());
        Unit unit = Unit.INSTANCE;
        ImageGraph imageGraphM6703l0 = m6703l0(this, name, strM6899b, f10, f11, matrixM6723m0, false, 32, null);
        m6675c0();
        return imageGraphM6703l0;
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: B */
    public void mo6705B(InterfaceC5119b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m6668V().m16495b().m6874f0(listener);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: C */
    public ImageGraph mo6706C(Bitmap bitmap, String filename, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z9, boolean z10) throws OutOfMaxImageCountException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (mo6734y() >= m6660N().getConfig().getMaxImageSize()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM14217g = AbstractC8630j.m14217g(this, bitmap, z10, filename);
        if (fileM14217g == null) {
            return null;
        }
        return m6717i0(fileM14217g, position, scaleType, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), z9);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: D */
    public void mo6707D(InterfaceC5123f interfaceC5123f) {
        m6658L().m12261z(interfaceC5123f);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: E */
    public void mo6708E(List graphIdList) {
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        m6660N().getConfig().setMode(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
        InterfaceC7523c interfaceC7523cM12254s = m6658L().m12254s();
        Intrinsics.checkNotNull(interfaceC7523cM12254s, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction");
        ((NewSelectAction) interfaceC7523cM12254s).m6131V(graphIdList);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: a */
    public void mo6709a(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        m6658L().m12258w(motionEvent);
    }

    @Override // p177n4.InterfaceC8629i
    public void areaMoveEnd(Float f10, Float f11) {
        InterfaceC7523c interfaceC7523cM12254s = m6658L().m12254s();
        if (interfaceC7523cM12254s instanceof AbstractC6626b) {
            ((AbstractC6626b) interfaceC7523cM12254s).m6104m(f10, f11);
        }
    }

    @Override // p177n4.InterfaceC8629i
    public void areaMoveStart() {
        InterfaceC7523c interfaceC7523cM12254s = m6658L().m12254s();
        if (interfaceC7523cM12254s instanceof AbstractC6626b) {
            ((AbstractC6626b) interfaceC7523cM12254s).m6105n();
        }
    }

    @Override // p177n4.InterfaceC8629i
    public void areaMoving(Float f10, Float f11) {
        InterfaceC7523c interfaceC7523cM12254s = m6658L().m12254s();
        if (interfaceC7523cM12254s instanceof AbstractC6626b) {
            ((AbstractC6626b) interfaceC7523cM12254s).m6106o(f10, f11);
        }
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: c */
    public ImageGraph mo6710c(Bitmap bitmap) throws OutOfMaxImageCountException {
        String strM6899b;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (mo6734y() >= m6660N().getConfig().getMaxImageSize()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM14218h = AbstractC8630j.m14218h(this, bitmap, false, null, 4, null);
        if (fileM14218h == null || (strM6899b = FileValidateUtils.m6899b(FileValidateUtils.f7853a, fileM14218h, null, 2, null)) == null || m6661O().mo13449n() == null) {
            return null;
        }
        String name = fileM14218h.getName();
        Intrinsics.checkNotNullExpressionValue(name, "newFile.name");
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        Matrix matrixM6723m0 = m6723m0(bitmap.getWidth(), bitmap.getHeight());
        matrixM6723m0.postConcat(m6663Q().m13190d());
        Unit unit = Unit.INSTANCE;
        ImageGraph imageGraphM6703l0 = m6703l0(this, name, strM6899b, width, height, matrixM6723m0, false, 32, null);
        m6675c0();
        return imageGraphM6703l0;
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: d */
    public void mo6711d(InterfaceC5120c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m6658L().m12255t().add(listener);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: e */
    public void mo6712e() {
        if (mo6733w()) {
            m6659M().m14196d(new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.edit.PageControl$turnOnMicro$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) throws IllegalAccessException, IllegalArgumentException {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String fileName) throws IllegalAccessException, IllegalArgumentException {
                    Intrinsics.checkNotNullParameter(fileName, "fileName");
                    this.f7697a.m6668V().m16494a().m6815e(fileName, 0L, System.currentTimeMillis());
                }
            });
        }
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: f */
    public ImageGraph mo6713f(String path, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z9) throws Throwable {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (mo6734y() >= m6660N().getConfig().getMaxImageSize()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM14219i = AbstractC8630j.m14219i(this, path);
        if (fileM14219i == null) {
            return null;
        }
        return m6702j0(this, fileM14219i, position, scaleType, null, null, z9, 24, null);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: g */
    public void mo6714g(InterfaceC5124g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m6659M().m14195c(listener);
    }

    @Override // p177n4.InterfaceC8629i
    public int getBackgroundColor() {
        return m6661O().getBackgroundColor();
    }

    @Override // p177n4.InterfaceC8629i
    public float getMoveHorizontalProgress() {
        InterfaceC7523c interfaceC7523cM12254s = m6658L().m12254s();
        if (interfaceC7523cM12254s instanceof AbstractC6626b) {
            return ((AbstractC6626b) interfaceC7523cM12254s).m6112u();
        }
        return 0.0f;
    }

    @Override // p177n4.InterfaceC8629i
    public float getMoveVerticalProgress() {
        InterfaceC7523c interfaceC7523cM12254s = m6658L().m12254s();
        Log.i("MoveProgress", String.valueOf(interfaceC7523cM12254s));
        if (interfaceC7523cM12254s instanceof AbstractC6626b) {
            return ((AbstractC6626b) interfaceC7523cM12254s).m6113w();
        }
        return 0.0f;
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: h */
    public void mo6715h(InterfaceC5127j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m6662P().m14198a(listener);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: i */
    public void mo6716i(InterfaceC8888c interfaceC8888c) {
        List listMo14995f;
        InterfaceC8888c interfaceC8888cMo13449n = m6661O().mo13449n();
        if (interfaceC8888cMo13449n == null || (listMo14995f = interfaceC8888cMo13449n.mo14995f()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo14995f) {
            if (!Intrinsics.areEqual((InterfaceC8888c) obj, interfaceC8888c)) {
                arrayList.add(obj);
            }
        }
        m6658L().mo12249n(arrayList, System.currentTimeMillis());
        C7347h c7347h = C7347h.f11914a;
        c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c7347h.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        m6661O().mo13452q(TypeIntrinsics.asMutableList(arrayList));
        m6675c0();
    }

    /* renamed from: i0 */
    public final ImageGraph m6717i0(File file, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, boolean z9) {
        String strM6899b = FileValidateUtils.m6899b(FileValidateUtils.f7853a, file, null, 2, null);
        if (strM6899b == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "localFile.absolutePath");
        Float[] fArrM14216f = AbstractC8630j.m14216f(this, absolutePath, scaleTypeEnum, num, num2);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "localFile.name");
        ImageGraph imageGraphM6720k0 = m6720k0(name, strM6899b, fArrM14216f[0].floatValue(), fArrM14216f[1].floatValue(), AbstractC8630j.m14215e(this, fArrM14216f[0].floatValue(), fArrM14216f[1].floatValue(), positionEnum, 0, 8, null), z9);
        m6675c0();
        return imageGraphM6720k0;
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: j */
    public void mo6718j(int i10, BackgroundLineConfig backgroundLineConfig) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        int backgroundColor = m6661O().getBackgroundColor();
        BackgroundLineConfig backgroundLineConfigM13423J = m6661O().m13423J();
        if (backgroundColor != i10 || !Intrinsics.areEqual(backgroundLineConfigM13423J, backgroundLineConfig)) {
            C7347h c7347h = C7347h.f11914a;
            c7347h.m11758b(EventKey.WRITE_NEW_GROUP);
            c7347h.m11758b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        m6661O().mo13438c(i10);
        m6661O().mo13455t(backgroundLineConfig);
        m6661O().mo13440e();
        m6668V().m16495b().m6860H(i10, i10, backgroundLineConfigM13423J, backgroundLineConfig, System.currentTimeMillis());
        HeaderEntity headerEntity = (HeaderEntity) m6665S().m6511e().m13064j();
        if (headerEntity != null) {
            headerEntity.m6439w(i10);
            ToOne toOneM6426j = headerEntity.m6426j();
            BackgroundLineConfigEntity backgroundLineConfigEntityM11753d = AbstractC7345f.m11753d(backgroundLineConfig);
            backgroundLineConfigEntityM11753d.m6311f();
            toOneM6426j.m13071t(backgroundLineConfigEntityM11753d);
            headerEntity.m6433q();
        }
        m6675c0();
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: k */
    public void mo6719k(InterfaceC5119b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m6668V().m16495b().m6870Z(listener);
    }

    /* renamed from: k0 */
    public final ImageGraph m6720k0(String str, String str2, float f10, float f11, Matrix matrix, boolean z9) {
        CommandInfoEntity commandInfoEntityM6859D;
        String strMo13437b = m6661O().mo13437b();
        if (strMo13437b == null || (commandInfoEntityM6859D = m6668V().m16495b().m6859D(strMo13437b, str, EzyGraphEnum.GraphEnum.IMAGE_GRAPH, str2, (int) f10, (int) f11, System.currentTimeMillis(), m6660N().getConfig().getIsImageBackground())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7244M(commandInfoEntityM6859D.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8886a abstractC8886aMo6761f = graphBuildFactory.mo6761f(graphData, m6669W());
        if (abstractC8886aMo6761f == null) {
            return null;
        }
        Matrix matrix2 = new Matrix(matrix);
        if (!z9) {
            matrix2.postConcat(AbstractC7352m.m11777b(m6663Q().m13188b()));
        }
        m6658L().mo12238c(CollectionsKt.arrayListOf(abstractC8886aMo6761f), CollectionsKt.mutableListOf(AbstractC7352m.m11778c(matrix2, System.currentTimeMillis())));
        abstractC8886aMo6761f.mo6747e(matrix2);
        C7347h c7347h = C7347h.f11914a;
        c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c7347h.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c7347h.m11758b(EventKey.WRITE_NEW_GROUP);
        if (m6660N().getConfig().getIsImageBackground()) {
            C7879b c7879bM6661O = m6661O();
            Intrinsics.checkNotNull(abstractC8886aMo6761f, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
            c7879bM6661O.mo13436a((ImageGraph) abstractC8886aMo6761f);
        } else {
            m6661O().mo13460y(graphData.m7265F(), abstractC8886aMo6761f);
        }
        String absolutePath = new File(C9850c.f17405d.m16497a(m6666T(), DocumentType.IMAGE), str).getAbsolutePath();
        if (mo6733w()) {
            m6667U().add(absolutePath);
        } else {
            m6664R().add(absolutePath);
        }
        Intrinsics.checkNotNull(abstractC8886aMo6761f, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
        return (ImageGraph) abstractC8886aMo6761f;
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: l */
    public Bitmap mo6721l(int i10, int i11, int i12, int i13, boolean z9, boolean z10, boolean z11, InterfaceC8888c interfaceC8888c) {
        return m6661O().m13425L(i10, i11, i12, i13, z9, z10, z11, interfaceC8888c);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: m */
    public boolean mo6722m() {
        List listMo14995f;
        InterfaceC8888c interfaceC8888cMo13449n = m6661O().mo13449n();
        return (interfaceC8888cMo13449n == null || (listMo14995f = interfaceC8888cMo13449n.mo14995f()) == null || !(listMo14995f.isEmpty() ^ true)) ? false : true;
    }

    /* renamed from: m0 */
    public final Matrix m6723m0(float f10, float f11) {
        float fMax;
        List<InterfaceC8888c> listMo14995f;
        float fMin = Math.min(f10, m6660N().getConfig().getWidth());
        float f12 = fMin / f10;
        float f13 = (f11 * fMin) / f10;
        Matrix matrix = new Matrix();
        matrix.setScale(f12, f12);
        matrix.postConcat(AbstractC8630j.m14215e(this, fMin, f13, EzyPositionEnum.PositionEnum.TOP_CENTER, 0, 8, null));
        InterfaceC8888c interfaceC8888cMo13449n = m6661O().mo13449n();
        if (interfaceC8888cMo13449n == null || (listMo14995f = interfaceC8888cMo13449n.mo14995f()) == null) {
            fMax = 0.0f;
        } else {
            fMax = 0.0f;
            for (InterfaceC8888c interfaceC8888c : listMo14995f) {
                if (interfaceC8888c instanceof ImageGraph) {
                    fMax = Math.max(interfaceC8888c.mo14994d().bottom, fMax);
                }
            }
        }
        matrix.postTranslate(0.0f, fMax);
        return matrix;
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: n */
    public boolean mo6724n() {
        return m6659M().m14194b();
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: o */
    public float mo6725o() {
        return AbstractC7352m.m11776a(m6663Q().m13190d());
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: p */
    public void mo6726p(InterfaceC5126i recordListener) {
        Intrinsics.checkNotNullParameter(recordListener, "recordListener");
        m6670X().m16505f(recordListener);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: q */
    public boolean mo6727q() {
        C7347h c7347h = C7347h.f11914a;
        c7347h.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        C8627g c8627gM14201d = m6662P().m14201d();
        if (c8627gM14201d == null) {
            return false;
        }
        m6668V().m16495b().m6869X(c8627gM14201d.m14204c(), c8627gM14201d.m14202a(), System.currentTimeMillis());
        return true;
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: r */
    public C9008d mo6728r(String content, EzyPositionEnum.PositionEnum position, int i10) {
        CommandInfoEntity commandInfoEntityM6863N;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(position, "position");
        Paint paint = new Paint();
        paint.setColor(m6660N().getConfig().getAddTextOriginalTextColor());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(m6660N().getConfig().getAddTextOriginalTextSize());
        paint.setDither(true);
        paint.setAntiAlias(true);
        float fWidth = m6660N().getConfig().getAddTextRectF().width();
        float fHeight = m6660N().getConfig().getAddTextRectF().height();
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C7358s.f11926a.m11795a(content, paint, fWidth).size();
        float f10 = size > fHeight ? size : fHeight;
        String strMo13437b = m6661O().mo13437b();
        if (strMo13437b == null || (commandInfoEntityM6863N = m6668V().m16495b().m6863N(strMo13437b, fWidth, f10, AbstractC7351l.m11770a(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7244M(commandInfoEntityM6863N.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8886a abstractC8886aMo6761f = graphBuildFactory.mo6761f(graphData, m6669W());
        if (abstractC8886aMo6761f == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(AbstractC8630j.m14214d(this, fWidth, f10, position, i10));
        matrix.postConcat(AbstractC7352m.m11777b(m6663Q().m13188b()));
        m6658L().mo12238c(CollectionsKt.arrayListOf(abstractC8886aMo6761f), CollectionsKt.mutableListOf(AbstractC7352m.m11778c(matrix, System.currentTimeMillis())));
        abstractC8886aMo6761f.mo6747e(matrix);
        m6661O().mo13460y(strMo13437b, abstractC8886aMo6761f);
        return (C9008d) abstractC8886aMo6761f;
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: s */
    public void mo6729s(float f10, float f11, float f12) {
        Matrix matrix = new Matrix(m6663Q().m13190d());
        float fM11776a = AbstractC7352m.m11776a(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.postScale(fM11776a, fM11776a, f10, f11);
        matrix.postConcat(AbstractC7352m.m11777b(matrix2));
        matrix.postScale(f12, f12, f10, f11);
        Matrix matrixM13190d = m6663Q().m13190d();
        m6663Q().m13196j(matrix);
        m6676d0(AbstractC7352m.m11778c(matrixM13190d, 0L), AbstractC7352m.m11778c(m6663Q().m13190d(), 0L));
        C7347h c7347h = C7347h.f11914a;
        c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c7347h.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c7347h.m11758b(EventKey.WRITE_NEW_GROUP);
        m6661O().mo13440e();
        m6661O().m13435V();
    }

    @Override // p177n4.InterfaceC8629i
    public void setAreaMoveListener(InterfaceC5121d interfaceC5121d) {
        m6658L().m12259x(interfaceC5121d);
    }

    @Override // p177n4.InterfaceC8629i
    public void stopRecord() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (mo6724n()) {
            mo6731u();
        }
        m6668V().m16495b().m6873d0(InterfaceC9849b.a.m16493a(m6670X(), System.currentTimeMillis(), false, 2, null));
        m6670X().m16509k(System.currentTimeMillis());
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: t */
    public void mo6730t(boolean z9) {
        m6670X().m16508i(System.currentTimeMillis());
        if (z9) {
            mo6712e();
        }
        m6667U().addAll(m6664R());
        m6664R().clear();
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: u */
    public void mo6731u() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        m6659M().m14197e(new Function2<String, Long, Unit>() { // from class: com.zykj.blackboard.core.edit.PageControl$turnOffMicro$1
            {
                super(2);
            }

            /* renamed from: a */
            public final void m6736a(String fileName, long j10) {
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                this.f7696a.m6668V().m16494a().m6820j(fileName, j10);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Long l10) {
                m6736a(str, l10.longValue());
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: v */
    public void mo6732v(InterfaceC5122e interfaceC5122e) {
        m6658L().m12260y(interfaceC5122e);
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: w */
    public boolean mo6733w() {
        return m6670X().m16504e();
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: y */
    public int mo6734y() {
        return m6661O().m13424K();
    }

    @Override // p177n4.InterfaceC8629i
    /* renamed from: z */
    public boolean mo6735z() {
        C7347h c7347h = C7347h.f11914a;
        c7347h.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        C8627g c8627gM14199b = m6662P().m14199b();
        if (c8627gM14199b == null) {
            return false;
        }
        m6668V().m16495b().m6869X(c8627gM14199b.m14204c(), c8627gM14199b.m14202a(), System.currentTimeMillis());
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControl(BoardControl boardControl, C8505j renderLayer, PageEntity pageEntity) {
        super(boardControl, renderLayer, pageEntity);
        Intrinsics.checkNotNullParameter(boardControl, "boardControl");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
    }
}
