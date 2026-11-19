package p215k2;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.ActivityUtils;
import com.friday.common.R$drawable;
import com.friday.common.R$mipmap;
import com.friday.common.camera.CameraActivity;
import com.friday.common.camera.CameraBean;
import com.friday.common.entity.FileType;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p219k6.C9824f;
import p235l6.AbstractC10150d;
import p304q6.InterfaceC10752l;
import p309qc.AbstractC10776g;

/* renamed from: k2.n */
/* loaded from: classes3.dex */
public abstract class AbstractC9796n {

    /* renamed from: a */
    public static final a f22990a = new a(null);

    /* renamed from: k2.n$a */
    public static final class a {

        /* renamed from: k2.n$a$a, reason: collision with other inner class name */
        public static final class C12143a implements InterfaceC10752l {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC9540l f22991a;

            public C12143a(InterfaceC9540l interfaceC9540l) {
                this.f22991a = interfaceC9540l;
            }

            @Override // p304q6.InterfaceC10752l
            /* renamed from: a */
            public void mo6615a(ArrayList arrayList) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    String strM9377j = ((LocalMedia) arrayList.get(0)).m9377j();
                    if (strM9377j == null && (strM9377j = ((LocalMedia) arrayList.get(0)).m9403z()) == null) {
                        strM9377j = ((LocalMedia) arrayList.get(0)).m9401x();
                    }
                    String str = strM9377j;
                    if (str != null) {
                        a.m19788b(AbstractC9796n.f22990a, str, null, 0, 6, null);
                    }
                }
                InterfaceC9540l interfaceC9540l = this.f22991a;
                if (interfaceC9540l != null) {
                    interfaceC9540l.invoke(1);
                }
            }

            @Override // p304q6.InterfaceC10752l
            public void onCancel() {
                InterfaceC9540l interfaceC9540l = this.f22991a;
                if (interfaceC9540l != null) {
                    interfaceC9540l.invoke(2);
                }
            }
        }

        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m19788b(a aVar, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 1;
            }
            aVar.m19790a(str, str2, i10);
        }

        /* renamed from: g */
        public static /* synthetic */ void m19789g(a aVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            aVar.m19794f(i10);
        }

        /* renamed from: a */
        public final void m19790a(String imagePath, String str, int i10) {
            AbstractC9979u.m20294g(imagePath, "imagePath");
            ActivityUtils.startActivity(BundleKt.bundleOf(AbstractC10776g.m22975a("CAMERA_BEAN", new CameraBean(1, imagePath, false, 0, 0, false, str, i10, 60, null))), (Class<? extends Activity>) CameraActivity.class);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: c */
        public final int m19791c(String fileType) {
            AbstractC9979u.m20294g(fileType, "fileType");
            int iHashCode = fileType.hashCode();
            if (iHashCode != 1567) {
                if (iHashCode != 1568) {
                    switch (iHashCode) {
                        case 50:
                            if (fileType.equals("2")) {
                                return R$drawable.file_type_page_big;
                            }
                            break;
                        case 51:
                            if (fileType.equals("3")) {
                                return R$drawable.file_type_ppt_big;
                            }
                            break;
                        case 52:
                            if (fileType.equals("4")) {
                                return R$drawable.file_type_word_big;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (fileType.equals(FileType.PDF)) {
                                return R$drawable.file_type_pdf_big;
                            }
                            break;
                        case 54:
                            if (fileType.equals(FileType.TXT)) {
                                return R$drawable.file_type_txt_big;
                            }
                            break;
                        case 55:
                            if (fileType.equals(FileType.PICTURE)) {
                                return R$drawable.file_type_picture_big;
                            }
                            break;
                        case Opcodes.FSTORE /* 56 */:
                            if (fileType.equals("8")) {
                                return R$drawable.file_type_video_big;
                            }
                            break;
                        case Opcodes.DSTORE /* 57 */:
                            if (fileType.equals("9")) {
                                return R$drawable.file_type_audio_big;
                            }
                            break;
                    }
                } else if (fileType.equals("11")) {
                    return R$drawable.file_type_micro_class_big;
                }
            } else if (fileType.equals("10")) {
                return R$drawable.file_type_excel_big;
            }
            return R$drawable.file_type_page_big;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: d */
        public final int m19792d(String fileType) {
            AbstractC9979u.m20294g(fileType, "fileType");
            int iHashCode = fileType.hashCode();
            switch (iHashCode) {
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    if (fileType.equals("0")) {
                        return R$mipmap.icon_item_folder;
                    }
                    break;
                case 49:
                    if (fileType.equals("1")) {
                        return R$drawable.file_type_note;
                    }
                    break;
                case 50:
                    if (fileType.equals("2")) {
                        return R$drawable.file_type_page;
                    }
                    break;
                case 51:
                    if (fileType.equals("3")) {
                        return R$drawable.file_type_ppt;
                    }
                    break;
                case 52:
                    if (fileType.equals("4")) {
                        return R$drawable.file_type_word;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (fileType.equals(FileType.PDF)) {
                        return R$drawable.file_type_pdf;
                    }
                    break;
                case 54:
                    if (fileType.equals(FileType.TXT)) {
                        return R$drawable.file_type_txt;
                    }
                    break;
                case 55:
                    if (fileType.equals(FileType.PICTURE)) {
                        return R$drawable.file_type_picture;
                    }
                    break;
                case Opcodes.FSTORE /* 56 */:
                    if (fileType.equals("8")) {
                        return R$drawable.file_type_video;
                    }
                    break;
                case Opcodes.DSTORE /* 57 */:
                    if (fileType.equals("9")) {
                        return R$drawable.file_type_audio;
                    }
                    break;
                default:
                    switch (iHashCode) {
                        case 1567:
                            if (fileType.equals("10")) {
                                return R$drawable.file_type_excel;
                            }
                            break;
                        case 1568:
                            if (fileType.equals("11")) {
                                return R$drawable.file_type_micro_class;
                            }
                            break;
                        case 1569:
                            if (fileType.equals("12")) {
                                return R$drawable.file_type_new_note;
                            }
                            break;
                    }
            }
            return R$drawable.file_type_note;
        }

        /* renamed from: e */
        public final void m19793e(Fragment fragment, InterfaceC9540l interfaceC9540l) {
            AbstractC9979u.m20294g(fragment, "fragment");
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(0);
            }
            C9824f.m19901b(fragment).m19904d(AbstractC10150d.m21192c()).m19898d(1).m19896b(false).m19897c(C9800r.m19802g()).m19895a(new C12143a(interfaceC9540l));
        }

        /* renamed from: f */
        public final void m19794f(int i10) {
            ActivityUtils.startActivity(BundleKt.bundleOf(AbstractC10776g.m22975a("CAMERA_BEAN", new CameraBean(0, null, false, 0, 0, false, null, i10, Opcodes.IAND, null))), (Class<? extends Activity>) CameraActivity.class);
        }

        public a() {
        }
    }
}
