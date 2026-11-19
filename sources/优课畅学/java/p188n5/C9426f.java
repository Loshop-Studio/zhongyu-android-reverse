package p188n5;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: n5.f */
/* loaded from: classes5.dex */
public class C9426f {

    /* renamed from: b */
    public a f18619b;

    /* renamed from: c */
    public int f18620c;

    /* renamed from: d */
    public float f18621d;

    /* renamed from: e */
    public Window f18622e;

    /* renamed from: f */
    public WindowManager.LayoutParams f18623f;

    /* renamed from: g */
    public ContentResolver f18624g;

    /* renamed from: h */
    public AudioManager f18625h;

    /* renamed from: i */
    public int f18626i;

    /* renamed from: k */
    public int f18628k;

    /* renamed from: l */
    public int f18629l;

    /* renamed from: a */
    public int f18618a = 0;

    /* renamed from: j */
    public int f18627j = 0;

    /* renamed from: m */
    public int f18630m = 20;

    /* renamed from: n */
    public float f18631n = 0.3f;

    /* renamed from: n5.f$a */
    public interface a {
        /* renamed from: a */
        void mo12467a(float f10);

        /* renamed from: b */
        void mo12468b(float f10);

        /* renamed from: c */
        void mo12469c(int i10);
    }

    public C9426f(Context context) {
        this.f18621d = 1.0f;
        this.f18626i = 0;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f18625h = audioManager;
        this.f18626i = audioManager.getStreamMaxVolume(3);
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            this.f18622e = window;
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f18623f = attributes;
            this.f18621d = attributes.screenBrightness;
        }
        this.f18624g = context.getContentResolver();
    }

    /* renamed from: a */
    public void m17272a(int i10, MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i11 = this.f18618a;
        if (i11 == 0) {
            if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > this.f18630m) {
                this.f18618a = 3;
                return;
            }
            if (motionEvent.getX() < this.f18620c / 2) {
                this.f18618a = 2;
                return;
            } else {
                this.f18618a = 1;
                return;
            }
        }
        if (i11 == 1) {
            int y10 = (int) ((((motionEvent.getY() - motionEvent2.getY()) / (i10 / this.f18626i)) * this.f18631n) + this.f18627j);
            this.f18625h.setStreamVolume(3, y10, 4);
            float f12 = (y10 / this.f18626i) * 100.0f;
            a aVar = this.f18619b;
            if (aVar != null) {
                aVar.mo12468b(f12);
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            int x10 = (int) (this.f18629l + (((motionEvent2.getX() - motionEvent.getX()) / this.f18620c) * 100.0f));
            this.f18628k = x10;
            a aVar2 = this.f18619b;
            if (aVar2 != null) {
                aVar2.mo12469c(x10);
                return;
            }
            return;
        }
        float f13 = 0.0f;
        float y11 = (i10 == 0 ? 0.0f : ((motionEvent.getY() - motionEvent2.getY()) / i10) * this.f18631n) + this.f18621d;
        if (y11 >= 0.0f) {
            f13 = 1.0f;
            if (y11 <= 1.0f) {
                f13 = y11;
            }
        }
        WindowManager.LayoutParams layoutParams = this.f18623f;
        if (layoutParams != null) {
            layoutParams.screenBrightness = f13;
        }
        Window window = this.f18622e;
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        a aVar3 = this.f18619b;
        if (aVar3 != null) {
            aVar3.mo12467a(f13);
        }
    }

    /* renamed from: b */
    public final int m17273b() {
        ContentResolver contentResolver = this.f18624g;
        if (contentResolver != null) {
            return Settings.System.getInt(contentResolver, "screen_brightness", 255);
        }
        return 255;
    }

    /* renamed from: c */
    public int m17274c() {
        return this.f18628k;
    }

    /* renamed from: d */
    public boolean m17275d() {
        return this.f18618a == 3;
    }

    /* renamed from: e */
    public void m17276e(int i10, int i11) {
        this.f18628k = 0;
        this.f18620c = i10;
        this.f18618a = 0;
        this.f18627j = this.f18625h.getStreamVolume(3);
        float f10 = this.f18623f.screenBrightness;
        this.f18621d = f10;
        if (f10 == -1.0f) {
            this.f18621d = m17273b() / 255.0f;
        }
        this.f18629l = i11;
    }

    /* renamed from: f */
    public void m17277f(a aVar) {
        this.f18619b = aVar;
    }
}
