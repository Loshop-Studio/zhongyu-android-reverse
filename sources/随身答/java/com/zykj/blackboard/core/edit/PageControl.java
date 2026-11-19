package com.zykj.blackboard.core.edit;

// RE note 管理 Blackboard 页面编辑状态及页面快照。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.action.AbstractC6943b;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
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
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p006a5.C0038b;
import p023b5.C5120j;
import p084d5.AbstractC7752l;
import p084d5.C7749i;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p127h5.C8101d;
import p189n5.C9097c;
import p189n5.InterfaceC9096b;
import p243s5.InterfaceC9474b;
import p243s5.InterfaceC9475c;
import p243s5.InterfaceC9476d;
import p243s5.InterfaceC9477e;
import p243s5.InterfaceC9478f;
import p243s5.InterfaceC9479g;
import p243s5.InterfaceC9481i;
import p243s5.InterfaceC9482j;
import p263u5.AbstractC9688g;
import p263u5.AbstractC9694m;
import p263u5.AbstractC9695n;
import p263u5.AbstractC9697p;
import p263u5.C9690i;
import p263u5.C9701t;
import p282w4.InterfaceC9823c;

/* loaded from: classes4.dex */
public final class PageControl extends BasePageControl {
    public /* synthetic */ PageControl(BoardControl boardControl, C5120j c5120j, PageEntity pageEntity, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(boardControl, c5120j, (i9 & 4) != 0 ? null : pageEntity);
    }

    /* renamed from: k0 */
    public static /* synthetic */ ImageGraph m7811k0(PageControl pageControl, File file, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, boolean z9, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            num = null;
        }
        if ((i9 & 16) != 0) {
            num2 = null;
        }
        if ((i9 & 32) != 0) {
            z9 = false;
        }
        return pageControl.m7828j0(file, positionEnum, scaleTypeEnum, num, num2, z9);
    }

    /* renamed from: m0 */
    public static /* synthetic */ ImageGraph m7812m0(PageControl pageControl, String str, String str2, float f10, float f11, Matrix matrix, boolean z9, int i9, Object obj) {
        if ((i9 & 32) != 0) {
            z9 = false;
        }
        return pageControl.m7831l0(str, str2, f10, f11, matrix, z9);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: A */
    public List mo7813A(List pathList, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum) throws Throwable {
        String strM8015b;
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        EzyPositionEnum.PositionEnum position = positionEnum;
        Intrinsics.checkNotNullParameter(position, "position");
        EzyScaleTypeEnum.ScaleTypeEnum scaleType = scaleTypeEnum;
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        ArrayList arrayList = new ArrayList();
        int size = pathList.size();
        int i9 = 0;
        while (i9 < size) {
            String str = (String) pathList.get(i9);
            if (mo7845y() >= m7764O().getConfig().m16517x()) {
                throw new OutOfMaxImageCountException();
            }
            File fileM12110i = AbstractC7752l.m12110i(this, str);
            if (fileM12110i == null || (strM8015b = FileValidateUtils.m8015b(FileValidateUtils.f9141a, fileM12110i, null, 2, null)) == null) {
                return arrayList;
            }
            String absolutePath = fileM12110i.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "newFile.absolutePath");
            Float[] fArrM12108g = AbstractC7752l.m12108g(this, absolutePath, scaleType, null, null, 12, null);
            Matrix matrixM12106e = AbstractC7752l.m12106e(this, fArrM12108g[0].floatValue(), fArrM12108g[1].floatValue(), position, 0, 8, null);
            float fM16450A = m7764O().getConfig().m16450A() * i9;
            matrixM12106e.postTranslate(fM16450A, fM16450A);
            String name = fileM12110i.getName();
            Intrinsics.checkNotNullExpressionValue(name, "newFile.name");
            ImageGraph imageGraphM7812m0 = m7812m0(this, name, strM8015b, fArrM12108g[0].floatValue(), fArrM12108g[1].floatValue(), matrixM12106e, false, 32, null);
            if (imageGraphM7812m0 != null) {
                arrayList.add(imageGraphM7812m0);
            }
            i9++;
            position = positionEnum;
            scaleType = scaleTypeEnum;
        }
        m7779d0();
        return arrayList;
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: B */
    public boolean mo7814B() {
        C9690i c9690i = C9690i.f17127a;
        c9690i.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        C7749i c7749iM12091b = m7766Q().m12091b();
        if (c7749iM12091b == null) {
            return false;
        }
        m7772W().m14635c().m7982Y(c7749iM12091b.m12096c(), c7749iM12091b.m12094a(), System.currentTimeMillis());
        return true;
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: C */
    public ImageGraph mo7815C(String path) throws Throwable {
        String strM8015b;
        Intrinsics.checkNotNullParameter(path, "path");
        if (mo7845y() >= m7764O().getConfig().m16517x()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM12110i = AbstractC7752l.m12110i(this, path);
        if (fileM12110i == null || (strM8015b = FileValidateUtils.m8015b(FileValidateUtils.f9141a, fileM12110i, null, 2, null)) == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        if (m7765P().mo210m() == null) {
            return null;
        }
        String name = fileM12110i.getName();
        Intrinsics.checkNotNullExpressionValue(name, "newFile.name");
        Matrix matrixM7834n0 = m7834n0(f10, f11);
        matrixM7834n0.postConcat(m7767R().m17346d());
        Unit unit = Unit.INSTANCE;
        ImageGraph imageGraphM7812m0 = m7812m0(this, name, strM8015b, f10, f11, matrixM7834n0, false, 32, null);
        m7779d0();
        return imageGraphM7812m0;
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: D */
    public ImageGraph mo7816D(Bitmap bitmap, String filename, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z9, boolean z10) throws OutOfMaxImageCountException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (mo7845y() >= m7764O().getConfig().m16517x()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM12109h = AbstractC7752l.m12109h(this, bitmap, z10, filename);
        if (fileM12109h == null) {
            return null;
        }
        return m7828j0(fileM12109h, position, scaleType, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), z9);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: E */
    public void mo7817E(InterfaceC9479g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m7763N().m12087c(listener);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: F */
    public void mo7818F(List graphIdList) {
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        m7764O().getConfig().m16498l0(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
        InterfaceC9823c interfaceC9823cM16700s = m7762M().m16700s();
        Intrinsics.checkNotNull(interfaceC9823cM16700s, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction");
        ((NewSelectAction) interfaceC9823cM16700s).m7227V(graphIdList);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: a */
    public void mo7819a(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        m7762M().m16704w(motionEvent);
    }

    @Override // p084d5.InterfaceC7751k
    public void areaMoveEnd(Float f10, Float f11) {
        InterfaceC9823c interfaceC9823cM16700s = m7762M().m16700s();
        if (interfaceC9823cM16700s instanceof AbstractC6943b) {
            ((AbstractC6943b) interfaceC9823cM16700s).m7200m(f10, f11);
        }
    }

    @Override // p084d5.InterfaceC7751k
    public void areaMoveStart() {
        InterfaceC9823c interfaceC9823cM16700s = m7762M().m16700s();
        if (interfaceC9823cM16700s instanceof AbstractC6943b) {
            ((AbstractC6943b) interfaceC9823cM16700s).m7201n();
        }
    }

    @Override // p084d5.InterfaceC7751k
    public void areaMoving(Float f10, Float f11) {
        InterfaceC9823c interfaceC9823cM16700s = m7762M().m16700s();
        if (interfaceC9823cM16700s instanceof AbstractC6943b) {
            ((AbstractC6943b) interfaceC9823cM16700s).m7202o(f10, f11);
        }
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: c */
    public void mo7820c() {
        if (mo7844w()) {
            m7763N().m12088d(new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.edit.PageControl$turnOnMicro$1
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
                    this.f8981a.m7772W().m14633a().m7927e(fileName, 0L, System.currentTimeMillis());
                }
            });
        }
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: d */
    public ImageGraph mo7821d(String path, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z9) throws Throwable {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (mo7845y() >= m7764O().getConfig().m16517x()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM12110i = AbstractC7752l.m12110i(this, path);
        if (fileM12110i == null) {
            return null;
        }
        return m7811k0(this, fileM12110i, position, scaleType, null, null, z9, 24, null);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: e */
    public void mo7822e(InterfaceC9482j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m7766Q().m12090a(listener);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: f */
    public void mo7823f(InterfaceC9481i recordListener) {
        Intrinsics.checkNotNullParameter(recordListener, "recordListener");
        m7774Y().m14645f(recordListener);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: g */
    public void mo7824g(int i9, BackgroundLineConfig backgroundLineConfig) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        int backgroundColor = m7765P().getBackgroundColor();
        BackgroundLineConfig backgroundLineConfigM184K = m7765P().m184K();
        if (backgroundColor != i9 || !Intrinsics.areEqual(backgroundLineConfigM184K, backgroundLineConfig)) {
            C9690i c9690i = C9690i.f17127a;
            c9690i.m16179b(EventKey.WRITE_NEW_GROUP);
            c9690i.m16179b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        m7765P().mo200c(i9);
        m7765P().mo215r(backgroundLineConfig);
        m7765P().mo202e();
        m7772W().m14635c().m7972H(i9, i9, backgroundLineConfigM184K, backgroundLineConfig, System.currentTimeMillis());
        HeaderEntity headerEntity = (HeaderEntity) m7769T().m7613e().m13183g();
        if (headerEntity != null) {
            headerEntity.m7539w(i9);
            ToOne toOneM7526j = headerEntity.m7526j();
            BackgroundLineConfigEntity backgroundLineConfigEntityM16174d = AbstractC9688g.m16174d(backgroundLineConfig);
            backgroundLineConfigEntityM16174d.m7404f();
            toOneM7526j.m13190w(backgroundLineConfigEntityM16174d);
            headerEntity.m7533q();
        }
        m7779d0();
    }

    @Override // p084d5.InterfaceC7751k
    public int getBackgroundColor() {
        return m7765P().getBackgroundColor();
    }

    @Override // p084d5.InterfaceC7751k
    public float getMoveHorizontalProgress() {
        InterfaceC9823c interfaceC9823cM16700s = m7762M().m16700s();
        if (interfaceC9823cM16700s instanceof AbstractC6943b) {
            return ((AbstractC6943b) interfaceC9823cM16700s).m7208u();
        }
        return 0.0f;
    }

    @Override // p084d5.InterfaceC7751k
    public float getMoveVerticalProgress() {
        InterfaceC9823c interfaceC9823cM16700s = m7762M().m16700s();
        Log.i("MoveProgress", String.valueOf(interfaceC9823cM16700s));
        if (interfaceC9823cM16700s instanceof AbstractC6943b) {
            return ((AbstractC6943b) interfaceC9823cM16700s).m7209w();
        }
        return 0.0f;
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: h */
    public void mo7825h(InterfaceC9474b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m7772W().m14635c().m7987g0(listener);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: i */
    public void mo7826i(InterfaceC9474b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m7772W().m14635c().m7983a0(listener);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: j */
    public void mo7827j(InterfaceC9477e interfaceC9477e) {
        m7762M().m16706y(interfaceC9477e);
    }

    /* renamed from: j0 */
    public final ImageGraph m7828j0(File file, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, boolean z9) {
        String strM8015b = FileValidateUtils.m8015b(FileValidateUtils.f9141a, file, null, 2, null);
        if (strM8015b == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "localFile.absolutePath");
        Float[] fArrM12107f = AbstractC7752l.m12107f(this, absolutePath, scaleTypeEnum, num, num2);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "localFile.name");
        ImageGraph imageGraphM7831l0 = m7831l0(name, strM8015b, fArrM12107f[0].floatValue(), fArrM12107f[1].floatValue(), AbstractC7752l.m12106e(this, fArrM12107f[0].floatValue(), fArrM12107f[1].floatValue(), positionEnum, 0, 8, null), z9);
        m7779d0();
        return imageGraphM7831l0;
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: k */
    public void mo7829k(InterfaceC9478f interfaceC9478f) {
        m7762M().m16707z(interfaceC9478f);
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: l */
    public List mo7830l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m7768S());
        arrayList.addAll(m7771V());
        return arrayList;
    }

    /* renamed from: l0 */
    public final ImageGraph m7831l0(String str, String str2, float f10, float f11, Matrix matrix, boolean z9) {
        CommandInfoEntity commandInfoEntityM7971D;
        String strMo199b = m7765P().mo199b();
        if (strMo199b == null || (commandInfoEntityM7971D = m7772W().m14635c().m7971D(strMo199b, str, EzyGraphEnum.GraphEnum.IMAGE_GRAPH, str2, (int) f10, (int) f11, System.currentTimeMillis(), m7764O().getConfig().m16469T())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(commandInfoEntityM7971D.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8053a abstractC8053aMo7873c = graphBuildFactory.mo7873c(graphData, m7773X());
        if (abstractC8053aMo7873c == null) {
            return null;
        }
        Matrix matrix2 = new Matrix(matrix);
        if (!z9) {
            matrix2.postConcat(AbstractC9695n.m16200b(m7767R().m17344b()));
        }
        m7762M().mo16684c(CollectionsKt.arrayListOf(abstractC8053aMo7873c), CollectionsKt.mutableListOf(AbstractC9695n.m16201c(matrix2, System.currentTimeMillis())));
        abstractC8053aMo7873c.mo7858d(matrix2);
        C9690i c9690i = C9690i.f17127a;
        c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c9690i.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c9690i.m16179b(EventKey.WRITE_NEW_GROUP);
        if (m7764O().getConfig().m16469T()) {
            C0038b c0038bM7765P = m7765P();
            Intrinsics.checkNotNull(abstractC8053aMo7873c, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
            c0038bM7765P.mo198a((ImageGraph) abstractC8053aMo7873c);
        } else {
            m7765P().mo222y(graphData.m8383I(), abstractC8053aMo7873c);
        }
        String absolutePath = new File(C9097c.f15322d.m14637a(m7770U(), DocumentType.IMAGE), str).getAbsolutePath();
        if (mo7844w()) {
            m7771V().add(absolutePath);
        } else {
            m7768S().add(absolutePath);
        }
        Intrinsics.checkNotNull(abstractC8053aMo7873c, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
        return (ImageGraph) abstractC8053aMo7873c;
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: m */
    public boolean mo7832m() {
        return m7763N().m12086b();
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: n */
    public float mo7833n() {
        return AbstractC9695n.m16199a(m7767R().m17346d());
    }

    /* renamed from: n0 */
    public final Matrix m7834n0(float f10, float f11) {
        float fMax;
        List<InterfaceC8055c> listMo12796e;
        float fMin = Math.min(f10, m7764O().getConfig().m16465P());
        float f12 = fMin / f10;
        float f13 = (f11 * fMin) / f10;
        Matrix matrix = new Matrix();
        matrix.setScale(f12, f12);
        matrix.postConcat(AbstractC7752l.m12106e(this, fMin, f13, EzyPositionEnum.PositionEnum.TOP_CENTER, 0, 8, null));
        InterfaceC8055c interfaceC8055cMo210m = m7765P().mo210m();
        if (interfaceC8055cMo210m == null || (listMo12796e = interfaceC8055cMo210m.mo12796e()) == null) {
            fMax = 0.0f;
        } else {
            fMax = 0.0f;
            for (InterfaceC8055c interfaceC8055c : listMo12796e) {
                if (interfaceC8055c instanceof ImageGraph) {
                    fMax = Math.max(interfaceC8055c.mo12795c().bottom, fMax);
                }
            }
        }
        matrix.postTranslate(0.0f, fMax);
        return matrix;
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: o */
    public boolean mo7835o() {
        C9690i c9690i = C9690i.f17127a;
        c9690i.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        C7749i c7749iM12093d = m7766Q().m12093d();
        if (c7749iM12093d == null) {
            return false;
        }
        m7772W().m14635c().m7982Y(c7749iM12093d.m12096c(), c7749iM12093d.m12094a(), System.currentTimeMillis());
        return true;
    }

    /* renamed from: o0 */
    public final void m7836o0(Function0 function0) throws Throwable {
        List listMo12796e;
        if (mo7844w()) {
            stopRecord();
        }
        Bitmap bitmap = (Bitmap) function0.invoke();
        if (bitmap != null) {
            AbstractC9697p.f17136a.m16208a(m7770U(), "screenshot.png", bitmap);
        }
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM196W = m7765P().m196W();
        if (graphSnapshotM196W != null) {
            EzyPageSnapshot.PageSnapshot.C7120b c7120bM8970w = EzyPageSnapshot.PageSnapshot.m8970w();
            c7120bM8970w.m9089z(graphSnapshotM196W);
            c7120bM8970w.m9087x(AbstractC9695n.m16201c(m7767R().m17346d(), 0L));
            StringBuilder sb = new StringBuilder();
            sb.append("[PageControl]:saveData -> [");
            sb.append(getFileName());
            sb.append("] s:");
            sb.append(graphSnapshotM196W.getChildGraphList().size());
            sb.append(", g:");
            InterfaceC8055c interfaceC8055cMo210m = m7765P().mo210m();
            sb.append((interfaceC8055cMo210m == null || (listMo12796e = interfaceC8055cMo210m.mo12796e()) == null) ? null : Integer.valueOf(listMo12796e.size()));
            sb.append("cm:");
            sb.append(c7120bM8970w.m9075l().getScaleX());
            LogUtils.m2956i(sb.toString());
            AbstractC9697p.a aVar = AbstractC9697p.f17136a;
            String strM7770U = m7770U();
            EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c7120bM8970w.build();
            Intrinsics.checkNotNullExpressionValue(pageSnapshotBuild, "builder.build()");
            aVar.m16209b(strM7770U, "snapshot.bin", pageSnapshotBuild);
        }
        HeaderEntity headerEntity = (HeaderEntity) m7769T().m7613e().m13183g();
        if (headerEntity != null) {
            headerEntity.m7540x(System.currentTimeMillis());
            headerEntity.m7536t(m7774Y().m14642c(System.currentTimeMillis()));
            headerEntity.m7535s(m7765P().m185L());
            headerEntity.m7539w(m7765P().getBackgroundColor());
            ToOne toOneM7521e = headerEntity.m7521e();
            BackgroundLineConfigEntity backgroundLineConfigEntityM16174d = AbstractC9688g.m16174d(m7765P().m186M());
            backgroundLineConfigEntityM16174d.m7404f();
            toOneM7521e.m13190w(backgroundLineConfigEntityM16174d);
            ToOne toOneM7526j = headerEntity.m7526j();
            BackgroundLineConfigEntity backgroundLineConfigEntityM16174d2 = AbstractC9688g.m16174d(m7765P().m184K());
            backgroundLineConfigEntityM16174d2.m7404f();
            toOneM7526j.m13190w(backgroundLineConfigEntityM16174d2);
            ToOne toOneM7527k = headerEntity.m7527k();
            MoveConfigEntity moveConfigEntityM16175e = AbstractC9688g.m16175e(m7764O().getConfig().m16519z());
            moveConfigEntityM16175e.m7603i();
            toOneM7527k.m13190w(moveConfigEntityM16175e);
            headerEntity.m7533q();
        }
        if (m7769T().getIsChange()) {
            m7769T().m7618j(false);
            m7769T().m7619k("");
            m7769T().m7620l(-1);
            m7769T().m7617i();
        }
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: p */
    public void mo7837p(InterfaceC8055c interfaceC8055c) {
        List listMo12796e;
        InterfaceC8055c interfaceC8055cMo210m = m7765P().mo210m();
        if (interfaceC8055cMo210m == null || (listMo12796e = interfaceC8055cMo210m.mo12796e()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo12796e) {
            if (!Intrinsics.areEqual((InterfaceC8055c) obj, interfaceC8055c)) {
                arrayList.add(obj);
            }
        }
        m7762M().mo16695n(arrayList, System.currentTimeMillis());
        C9690i c9690i = C9690i.f17127a;
        c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c9690i.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        m7765P().mo212o(TypeIntrinsics.asMutableList(arrayList));
        m7779d0();
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: q */
    public C8101d mo7838q(String content, EzyPositionEnum.PositionEnum position, int i9) {
        CommandInfoEntity commandInfoEntityM7975N;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(position, "position");
        Paint paint = new Paint();
        paint.setColor(m7764O().getConfig().m16478b());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(m7764O().getConfig().m16483e());
        paint.setDither(true);
        paint.setAntiAlias(true);
        float fWidth = m7764O().getConfig().m16485f().width();
        float fHeight = m7764O().getConfig().m16485f().height();
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C9701t.f17139a.m16219a(content, paint, fWidth).size();
        float f10 = size > fHeight ? size : fHeight;
        String strMo199b = m7765P().mo199b();
        if (strMo199b == null || (commandInfoEntityM7975N = m7772W().m14635c().m7975N(strMo199b, fWidth, f10, AbstractC9694m.m16193a(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(commandInfoEntityM7975N.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8053a abstractC8053aMo7873c = graphBuildFactory.mo7873c(graphData, m7773X());
        if (abstractC8053aMo7873c == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(AbstractC7752l.m12105d(this, fWidth, f10, position, i9));
        matrix.postConcat(AbstractC9695n.m16200b(m7767R().m17344b()));
        m7762M().mo16684c(CollectionsKt.arrayListOf(abstractC8053aMo7873c), CollectionsKt.mutableListOf(AbstractC9695n.m16201c(matrix, System.currentTimeMillis())));
        abstractC8053aMo7873c.mo7858d(matrix);
        m7765P().mo222y(strMo199b, abstractC8053aMo7873c);
        return (C8101d) abstractC8053aMo7873c;
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: r */
    public void mo7839r(float f10, float f11, float f12) {
        Matrix matrix = new Matrix(m7767R().m17346d());
        float fM16199a = AbstractC9695n.m16199a(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.postScale(fM16199a, fM16199a, f10, f11);
        matrix.postConcat(AbstractC9695n.m16200b(matrix2));
        matrix.postScale(f12, f12, f10, f11);
        Matrix matrixM17346d = m7767R().m17346d();
        m7767R().m17352j(matrix);
        m7780e0(AbstractC9695n.m16201c(matrixM17346d, 0L), AbstractC9695n.m16201c(m7767R().m17346d(), 0L));
        C9690i c9690i = C9690i.f17127a;
        c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c9690i.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c9690i.m16179b(EventKey.WRITE_NEW_GROUP);
        m7765P().mo202e();
        m7765P().m197X();
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: s */
    public void mo7840s(boolean z9) {
        m7774Y().m14648i(System.currentTimeMillis());
        if (z9) {
            mo7820c();
        }
        m7771V().addAll(m7768S());
        m7768S().clear();
    }

    @Override // p084d5.InterfaceC7751k
    public void save() throws Throwable {
        m7836o0(new Function0<Bitmap>() { // from class: com.zykj.blackboard.core.edit.PageControl.save.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bitmap invoke() {
                return PageControl.this.m7765P().m191R();
            }
        });
    }

    @Override // p084d5.InterfaceC7751k
    public void setAreaMoveListener(InterfaceC9476d interfaceC9476d) {
        m7762M().m16705x(interfaceC9476d);
    }

    @Override // p084d5.InterfaceC7751k
    public void stopRecord() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (mo7832m()) {
            mo7841t();
        }
        m7772W().m14635c().m7986e0(InterfaceC9096b.a.m14632a(m7774Y(), System.currentTimeMillis(), false, 2, null));
        m7774Y().m14649k(System.currentTimeMillis());
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: t */
    public void mo7841t() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        m7763N().m12089e(new Function2<String, Long, Unit>() { // from class: com.zykj.blackboard.core.edit.PageControl$turnOffMicro$1
            {
                super(2);
            }

            /* renamed from: a */
            public final void m7849a(String fileName, long j9) {
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                this.f8980a.m7772W().m14633a().m7932j(fileName, j9);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Long l9) {
                m7849a(str, l9.longValue());
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: u */
    public void mo7842u() throws Throwable {
        m7836o0(new Function0<Bitmap>() { // from class: com.zykj.blackboard.core.edit.PageControl$saveWithContentThumbnail$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bitmap invoke() {
                return this.f8979a.m7765P().m183J();
            }
        });
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: v */
    public boolean mo7843v() {
        return m7762M().m16702u().m16736d().m7102R() && m7772W().m14634b();
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: w */
    public boolean mo7844w() {
        return m7774Y().m14644e();
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: y */
    public int mo7845y() {
        return m7765P().m187N();
    }

    @Override // p084d5.InterfaceC7751k
    /* renamed from: z */
    public void mo7846z(InterfaceC9475c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m7762M().m16701t().add(listener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControl(BoardControl boardControl, C5120j renderLayer, PageEntity pageEntity) {
        super(boardControl, renderLayer, pageEntity);
        Intrinsics.checkNotNullParameter(boardControl, "boardControl");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
    }
}
