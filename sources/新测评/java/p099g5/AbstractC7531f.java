package p099g5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.hardware.Camera;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.zykj.camera.R$id;
import com.zykj.camera.R$styleable;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import p099g5.AbstractAsyncTaskC7530e;
import p099g5.SurfaceHolderCallbackC7528c;
import p110h5.C7629a;

/* renamed from: g5.f */
/* loaded from: classes4.dex */
public abstract class AbstractC7531f extends FrameLayout implements AbstractAsyncTaskC7530e.a, SurfaceHolderCallbackC7528c.f {

    /* renamed from: a */
    public Camera f12448a;

    /* renamed from: b */
    public SurfaceHolderCallbackC7528c f12449b;

    /* renamed from: c */
    public C7532g f12450c;

    /* renamed from: d */
    public d f12451d;

    /* renamed from: e */
    public boolean f12452e;

    /* renamed from: f */
    public AbstractAsyncTaskC7530e f12453f;

    /* renamed from: g */
    public View f12454g;

    /* renamed from: h */
    public TextView f12455h;

    /* renamed from: i */
    public TextView f12456i;

    /* renamed from: j */
    public ImageView f12457j;

    /* renamed from: k */
    public InterfaceC7529d f12458k;

    /* renamed from: l */
    public boolean f12459l;

    /* renamed from: g5.f$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC7531f.this.setLight(!view.isSelected());
            AbstractC7531f.this.f12457j.setSelected(!view.isSelected());
        }
    }

    /* renamed from: g5.f$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f12461a;

        public b(int i10) {
            this.f12461a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC7531f.this.f12448a = Camera.open(this.f12461a);
                AbstractC7531f abstractC7531f = AbstractC7531f.this;
                abstractC7531f.f12449b.setCamera(abstractC7531f.f12448a);
                Point picSize = AbstractC7531f.this.f12449b.getPicSize();
                ViewGroup.LayoutParams layoutParams = AbstractC7531f.this.getLayoutParams();
                layoutParams.height = (int) (AbstractC7531f.this.getWidth() * (picSize.x / picSize.y));
                AbstractC7531f.this.setLayoutParams(layoutParams);
                AbstractC7531f.this.f12449b.m12316p();
                AbstractC7531f abstractC7531f2 = AbstractC7531f.this;
                abstractC7531f2.setLight(abstractC7531f2.f12459l);
                AbstractC7531f abstractC7531f3 = AbstractC7531f.this;
                abstractC7531f3.f12457j.setSelected(abstractC7531f3.f12459l);
            } catch (Exception e10) {
                Log.e("QRCodeView", "相机调用出错-->>" + e10.getMessage());
                d dVar = AbstractC7531f.this.f12451d;
                if (dVar != null) {
                    dVar.mo10397c();
                }
            }
        }
    }

    /* renamed from: g5.f$c */
    public class c extends AbstractAsyncTaskC7530e {
        public c(Camera camera, byte[] bArr, AbstractAsyncTaskC7530e.a aVar) {
            super(camera, bArr, aVar);
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(C7629a c7629a) {
            d dVar;
            Log.e(this.f12444a, "分析完成>>>>>");
            AbstractC7531f abstractC7531f = AbstractC7531f.this;
            if (!abstractC7531f.f12452e || (dVar = abstractC7531f.f12451d) == null || c7629a == null) {
                return;
            }
            if (c7629a.f12816a) {
                dVar.mo10395a(c7629a);
            } else {
                dVar.mo10396b(c7629a);
            }
        }
    }

    /* renamed from: g5.f$d */
    public interface d {
        /* renamed from: a */
        void mo10395a(C7629a c7629a);

        /* renamed from: b */
        void mo10396b(C7629a c7629a);

        /* renamed from: c */
        void mo10397c();
    }

    public AbstractC7531f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12452e = false;
        this.f12459l = true;
        m12326g(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLight(boolean z9) {
        Camera camera = this.f12448a;
        if (camera != null) {
            boolean z10 = false;
            if (z9) {
                Camera.Parameters parameters = camera.getParameters();
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
                    Toast.makeText(getContext(), "该设备不支持闪光灯", 0).show();
                } else {
                    parameters.setFlashMode("torch");
                }
                this.f12448a.setParameters(parameters);
            } else {
                Camera.Parameters parameters2 = camera.getParameters();
                List<String> supportedFlashModes2 = parameters2.getSupportedFlashModes();
                if (supportedFlashModes2 == null || !supportedFlashModes2.contains(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                    Toast.makeText(getContext(), "该设备不支持闪光灯", 0).show();
                } else {
                    parameters2.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
                }
                this.f12448a.setParameters(parameters2);
            }
            if (this.f12458k != null) {
                String flashMode = this.f12448a.getParameters().getFlashMode();
                if (flashMode != null && flashMode.equals("torch")) {
                    z10 = true;
                }
                this.f12458k.mo2475a(z10);
            }
        }
    }

    /* renamed from: d */
    public void m12323d() {
        AbstractAsyncTaskC7530e abstractAsyncTaskC7530e = this.f12453f;
        if (abstractAsyncTaskC7530e != null) {
            abstractAsyncTaskC7530e.m12318a();
            this.f12453f = null;
        }
    }

    /* renamed from: e */
    public void m12324e() {
        if (this.f12450c != null) {
            this.f12454g.setVisibility(0);
            this.f12450c.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void m12325f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.QRCodeView);
        this.f12456i.setText(typedArrayObtainStyledAttributes.getString(R$styleable.QRCodeView_view_TipText));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final void m12326g(Context context, AttributeSet attributeSet) {
        this.f12449b = new SurfaceHolderCallbackC7528c(getContext(), this);
        C7532g c7532g = new C7532g(getContext());
        this.f12450c = c7532g;
        c7532g.m12346i(context, attributeSet);
        this.f12450c.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f12449b, layoutParams);
        addView(this.f12450c);
        View tipsView = getTipsView();
        this.f12454g = tipsView;
        this.f12455h = (TextView) tipsView.findViewById(R$id.tips);
        this.f12456i = (TextView) this.f12454g.findViewById(R$id.tv_portrait_tip);
        ImageView imageView = (ImageView) this.f12454g.findViewById(R$id.ck_light);
        this.f12457j = imageView;
        imageView.setOnClickListener(new a());
        addView(this.f12454g);
        m12325f(context, attributeSet);
    }

    public abstract View getTipsView();

    /* renamed from: h */
    public void m12327h() {
        if (this.f12450c != null) {
            this.f12454g.setVisibility(8);
            this.f12450c.setVisibility(0);
        }
    }

    /* renamed from: i */
    public void m12328i() {
        m12329j(0, false);
    }

    /* renamed from: j */
    public void m12329j(int i10, boolean z9) {
        if (this.f12448a != null) {
            return;
        }
        this.f12459l = z9;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i11 = 0; i11 < Camera.getNumberOfCameras(); i11++) {
            Camera.getCameraInfo(i11, cameraInfo);
            if (cameraInfo.facing == i10) {
                m12330k(i11);
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m12330k(int i10) {
        post(new b(i10));
    }

    /* renamed from: l */
    public void m12331l(boolean z9) {
        m12333n(1000, z9);
    }

    /* renamed from: m */
    public void m12332m(String str, boolean z9) {
        if (!TextUtils.isEmpty(str)) {
            this.f12455h.setText(str);
        }
        m12331l(z9);
    }

    /* renamed from: n */
    public void m12333n(int i10, boolean z9) {
        this.f12452e = true;
        this.f12459l = z9;
        m12329j(0, z9);
    }

    /* renamed from: o */
    public void m12334o() {
        m12336q();
        this.f12457j.setSelected(false);
        if (this.f12448a != null) {
            this.f12449b.m12317q();
            this.f12449b.setCamera(null);
            this.f12448a.release();
            this.f12448a = null;
        }
    }

    @Override // p099g5.SurfaceHolderCallbackC7528c.f
    public void onPictureTaken(byte[] bArr, Camera camera) {
        m12327h();
        if (this.f12452e) {
            m12323d();
            this.f12453f = new c(camera, bArr, this).m12320c();
        }
    }

    /* renamed from: p */
    public void m12335p() {
        m12323d();
        this.f12457j.setSelected(false);
        this.f12452e = false;
        Camera camera = this.f12448a;
        if (camera != null) {
            camera.setOneShotPreviewCallback(null);
        }
    }

    /* renamed from: q */
    public void m12336q() {
        m12335p();
        m12324e();
    }

    public void setDelegate(d dVar) {
        this.f12451d = dVar;
    }

    public void setOnLightStatusListener(InterfaceC7529d interfaceC7529d) {
        this.f12458k = interfaceC7529d;
    }

    public void setResultTips(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f12455h.setText(str);
    }
}
