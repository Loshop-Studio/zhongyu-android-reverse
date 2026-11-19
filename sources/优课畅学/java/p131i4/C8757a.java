package p131i4;

import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.AbstractC5379p;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.render.SketchViewer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p085e4.AbstractC8351a;
import p097f4.C8437b;
import p097f4.C8438c;

/* renamed from: i4.a */
/* loaded from: classes.dex */
public class C8757a {

    /* renamed from: a */
    public String f16415a;

    /* renamed from: b */
    public SketchViewer f16416b;

    /* renamed from: c */
    public C8438c f16417c;

    /* renamed from: d */
    public boolean f16418d;

    /* renamed from: e */
    public ScheduledExecutorService f16419e = Executors.newScheduledThreadPool(1);

    public C8757a(SketchViewer sketchViewer, C8438c c8438c) {
        this.f16416b = sketchViewer;
        this.f16417c = c8438c;
    }

    /* renamed from: a */
    public void m14450a() {
        this.f16418d = false;
        ScheduledExecutorService scheduledExecutorService = this.f16419e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    /* renamed from: b */
    public void m14451b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Actions.EzyAction ezyAction = (Actions.EzyAction) it.next();
            if (!this.f16418d) {
                return;
            }
            ezyAction.m9629n();
            String typeUrl = ezyAction.m9625i().getTypeUrl();
            int iM9624h = ezyAction.m9624h();
            int iM9628m = ezyAction.m9628m();
            Log.i("ActionProcessor", "名称为[" + typeUrl + "] actionType=[" + iM9624h + "]id=[" + iM9628m + "]");
            if (iM9624h == AbstractC8351a.f15862a) {
                this.f16417c.m13784f().f16019g.clear();
            } else if (iM9624h == AbstractC8351a.f15868g || iM9624h == AbstractC8351a.f15865d || iM9624h == AbstractC8351a.f15870i || iM9624h == AbstractC8351a.f15867f || iM9624h == AbstractC8351a.f15864c || iM9624h == AbstractC8351a.f15869h) {
                this.f16417c.mo13781c(iM9628m);
            } else if (!TextUtils.isEmpty(typeUrl)) {
                String str = typeUrl.split("/")[1];
                if (str.equals("NewPolylineData")) {
                    m14457h(ezyAction);
                } else if (str.equals("NewLayerData")) {
                    m14454e(ezyAction);
                } else if (str.equals("NewImageData")) {
                    m14453d(ezyAction);
                } else if (str.equals("EzyMatrixData")) {
                    m14455f(ezyAction);
                }
            }
        }
        this.f16416b.m9712w();
    }

    /* renamed from: c */
    public void m14452c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Actions.EzyAction ezyAction = (Actions.EzyAction) it.next();
            ezyAction.m9629n();
            String typeUrl = ezyAction.m9625i().getTypeUrl();
            int iM9624h = ezyAction.m9624h();
            int iM9628m = ezyAction.m9628m();
            Log.i("ActionProcessor", "名称为[" + typeUrl + "] actionType=[" + iM9624h + "]id=[" + iM9628m + "]");
            if (iM9624h == AbstractC8351a.f15862a) {
                this.f16417c.m13784f().f16019g.clear();
            } else if (iM9624h == AbstractC8351a.f15868g || iM9624h == AbstractC8351a.f15865d || iM9624h == AbstractC8351a.f15870i || iM9624h == AbstractC8351a.f15867f || iM9624h == AbstractC8351a.f15864c || iM9624h == AbstractC8351a.f15869h) {
                this.f16417c.mo13781c(iM9628m);
            } else if (!TextUtils.isEmpty(typeUrl)) {
                String str = typeUrl.split("/")[1];
                if (str.equals("NewPolylineData")) {
                    m14456g(ezyAction);
                } else if (str.equals("NewLayerData")) {
                    m14454e(ezyAction);
                } else if (str.equals("NewImageData")) {
                    m14453d(ezyAction);
                } else if (str.equals("EzyMatrixData")) {
                    m14455f(ezyAction);
                }
            }
        }
        this.f16416b.m9714y();
    }

    /* renamed from: d */
    public void m14453d(Actions.EzyAction ezyAction) {
        try {
            AbstractC5379p.m2596a(ezyAction.m9625i().unpack(Actions.NewImageData.class));
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
        if (ezyAction.m9624h() == AbstractC8351a.f15866e) {
            throw null;
        }
    }

    /* renamed from: e */
    public void m14454e(Actions.EzyAction ezyAction) {
        try {
            AbstractC5379p.m2596a(ezyAction.m9625i().unpack(Actions.NewLayerData.class));
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
        if (ezyAction.m9624h() != AbstractC8351a.f15863b) {
            return;
        }
        new C8437b();
        throw null;
    }

    /* renamed from: f */
    public void m14455f(Actions.EzyAction ezyAction) {
        ezyAction.m9628m();
        try {
            AbstractC5379p.m2596a(ezyAction.m9625i().unpack(Actions.EzyMatrixData.class));
            throw null;
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m14456g(Actions.EzyAction ezyAction) {
        try {
            AbstractC5379p.m2596a(ezyAction.m9625i().unpack(Actions.NewPolylineData.class));
            throw null;
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m14457h(Actions.EzyAction ezyAction) {
        try {
            ezyAction.m9627l();
            AbstractC5379p.m2596a(ezyAction.m9625i().unpack(Actions.NewPolylineData.class));
            throw null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m14458i(String str) {
        this.f16415a = str;
        this.f16418d = true;
    }
}
