package com.friday.common.util;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.AppUtils;
import java.io.File;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9545q;

/* loaded from: classes3.dex */
public abstract class PhotoUtils {

    /* renamed from: a */
    public static final C5971a f6151a = new C5971a(null);

    /* renamed from: b */
    public static final String f6152b = AppUtils.getAppPackageName() + ".utilcode.provider";

    @StabilityInferred(parameters = 0)
    public static final class PhotoFragment extends Fragment {

        /* renamed from: i */
        public static final C5970a f6153i = new C5970a(null);

        /* renamed from: j */
        public static final int f6154j = 8;

        /* renamed from: d */
        public InterfaceC9545q f6155d;

        /* renamed from: e */
        public InterfaceC9545q f6156e;

        /* renamed from: f */
        public InterfaceC9545q f6157f;

        /* renamed from: g */
        public String f6158g;

        /* renamed from: h */
        public Uri f6159h;

        /* renamed from: com.friday.common.util.PhotoUtils$PhotoFragment$a */
        public static final class C5970a {
            public /* synthetic */ C5970a(AbstractC9972n abstractC9972n) {
                this();
            }

            public C5970a() {
            }
        }

        /* renamed from: o */
        public final String m5374o() {
            String str = this.f6158g;
            if (str != null) {
                return str;
            }
            AbstractC9979u.m20312y("cameraPath");
            return null;
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int i10, int i11, Intent intent) {
            super.onActivityResult(i10, i11, intent);
            if (i11 != -1) {
                switch (i10) {
                    case 601:
                        InterfaceC9545q interfaceC9545q = this.f6155d;
                        if (interfaceC9545q != null) {
                            interfaceC9545q.invoke(null, Boolean.FALSE, "裁剪失败");
                        }
                        this.f6155d = null;
                        break;
                    case TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE /* 602 */:
                        InterfaceC9545q interfaceC9545q2 = this.f6157f;
                        if (interfaceC9545q2 != null) {
                            interfaceC9545q2.invoke(null, Boolean.FALSE, "拍照失败");
                        }
                        this.f6157f = null;
                        break;
                    case TypedValues.MotionType.TYPE_EASING /* 603 */:
                        InterfaceC9545q interfaceC9545q3 = this.f6156e;
                        if (interfaceC9545q3 != null) {
                            interfaceC9545q3.invoke(null, Boolean.FALSE, "选择图片失败");
                        }
                        this.f6156e = null;
                        break;
                }
            }
            switch (i10) {
                case 601:
                    InterfaceC9545q interfaceC9545q4 = this.f6155d;
                    if (interfaceC9545q4 != null) {
                        interfaceC9545q4.invoke(this.f6159h, Boolean.TRUE, "");
                    }
                    this.f6155d = null;
                    break;
                case TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE /* 602 */:
                    Uri uriForFile = FileProvider.getUriForFile(requireContext(), PhotoUtils.f6152b, new File(m5374o()));
                    InterfaceC9545q interfaceC9545q5 = this.f6157f;
                    if (interfaceC9545q5 != null) {
                        interfaceC9545q5.invoke(uriForFile, Boolean.TRUE, "");
                    }
                    this.f6157f = null;
                    break;
                case TypedValues.MotionType.TYPE_EASING /* 603 */:
                    Uri data = intent != null ? intent.getData() : null;
                    InterfaceC9545q interfaceC9545q6 = this.f6156e;
                    if (interfaceC9545q6 != null) {
                        interfaceC9545q6.invoke(data, Boolean.TRUE, "");
                    }
                    this.f6156e = null;
                    break;
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setRetainInstance(true);
        }

        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            AbstractC9979u.m20294g(view, "view");
            super.onViewCreated(view, bundle);
            requireActivity().setRequestedOrientation(0);
        }
    }

    /* renamed from: com.friday.common.util.PhotoUtils$a */
    public static final class C5971a {
        public /* synthetic */ C5971a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5971a() {
        }
    }
}
