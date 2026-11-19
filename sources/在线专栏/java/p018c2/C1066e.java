package p018c2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.zykj.download.OssUtils;
import com.zykj.subscriber.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p116l2.C2847h;

/* renamed from: c2.e */
/* loaded from: classes.dex */
public final class C1066e extends Fragment {

    /* renamed from: d */
    @NotNull
    public static final a f6249d = new a(null);

    /* renamed from: a */
    @NotNull
    public Map<Integer, View> f6250a = new LinkedHashMap();

    /* renamed from: b */
    private String f6251b;

    /* renamed from: c */
    private String f6252c;

    /* renamed from: c2.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C1066e m4948a(@NotNull String path, @NotNull String url) {
            C2769l.m9241e(path, "path");
            C2769l.m9241e(url, "url");
            C1066e c1066e = new C1066e();
            Bundle bundle = new Bundle();
            bundle.putString(OssUtils.FILE_PATH, path);
            bundle.putString("url_path", url);
            c1066e.setArguments(bundle);
            return c1066e;
        }
    }

    /* renamed from: b */
    private final void m4946b() {
        ImageView imageView;
        String str = this.f6251b;
        String str2 = null;
        if (str == null) {
            C2769l.m9256t("localPath");
            str = null;
        }
        if (!new File(str).exists()) {
            Context contextRequireContext = requireContext();
            String str3 = this.f6251b;
            if (str3 == null) {
                C2769l.m9256t("localPath");
            } else {
                str2 = str3;
            }
            Toast.makeText(contextRequireContext, C2769l.m9248l("文件不存在:", str2), 0).show();
            return;
        }
        View view = getView();
        if (view == null || (imageView = (ImageView) view.findViewById(R.id.iv_prev)) == null) {
            return;
        }
        RequestManager requestManagerWith = Glide.with(requireContext());
        String str4 = this.f6252c;
        if (str4 == null) {
            C2769l.m9256t("urlPath");
        } else {
            str2 = str4;
        }
        requestManagerWith.load(str2).into(imageView);
    }

    /* renamed from: a */
    public void m4947a() {
        this.f6250a.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        m4946b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString(OssUtils.FILE_PATH);
        if (string == null || string.length() == 0) {
            C2847h c2847h = C2847h.f10954a;
            Context contextRequireContext = requireContext();
            C2769l.m9240d(contextRequireContext, "requireContext()");
            c2847h.m9553a(contextRequireContext, "文件不存在");
        } else {
            C2769l.m9240d(string, "this");
            this.f6251b = string;
        }
        String string2 = arguments.getString("url_path");
        if (!(string2 == null || string2.length() == 0)) {
            C2769l.m9240d(string2, "this");
            this.f6252c = string2;
        } else {
            C2847h c2847h2 = C2847h.f10954a;
            Context contextRequireContext2 = requireContext();
            C2769l.m9240d(contextRequireContext2, "requireContext()");
            c2847h2.m9553a(contextRequireContext2, "Url不存在");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2769l.m9241e(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_image, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m4947a();
    }
}
