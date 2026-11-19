package p382w1;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import cc.AbstractC5418a;
import cc.AbstractC5419b;
import com.friday.cloudsnote.App;
import com.friday.cloudsnote.view.MainActivity;
import com.friday.cloudsnote.viewModel.MainViewModel;
import com.friday.common.MyDataBase;
import com.friday.common.activity.RequestScreenCastActivity;
import com.friday.common.camera.CameraActivity;
import com.friday.common.camera.CameraViewModel;
import com.friday.common.camera.ImageCropFragment;
import com.friday.common.camera.ImagePickFragment;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.dao.UserDao;
import com.friday.common.network.RefreshRepositoryImpl;
import com.friday.common.network.StudentSession;
import com.friday.common.network.StudentSessionInterceptor;
import com.friday.document.receiver.AliMessageReceiver;
import com.friday.document.repositroy.FileRepository;
import com.friday.document.service.FileManager;
import com.friday.document.sync.SyncStateOne;
import com.friday.document.sync.SyncStateThree;
import com.friday.document.view.FolderPreviewFragment;
import com.friday.document.view.ManualSyncFileDialog;
import com.friday.document.view.NewestPreviewFragment;
import com.friday.document.view.RecycleBinPreviewFragment;
import com.friday.document.view.TeacherOnlyActivity;
import com.friday.document.view.document.FileListFragment;
import com.friday.document.view.document.FolderFragment;
import com.friday.document.view.document.NewestFragment;
import com.friday.document.view.document.RecycleBinFragment;
import com.friday.document.view.preview.PdfPreviewFragment;
import com.friday.document.view.preview.TxtPreviewFragment;
import com.friday.document.view.preview.VideoPreviewFragment;
import com.friday.document.view.share.ShareBaseFileFragment;
import com.friday.document.view.share.ShareByTeacherFragment;
import com.friday.document.view.share.ShareListFragment;
import com.friday.document.view.share.ShareSearchActivity;
import com.friday.document.view.share.ShareTeacherFileFragment;
import com.friday.document.view.share.StudentShareFragment;
import com.friday.document.view.share.StudentSharePreviewFragment;
import com.friday.document.view.viewer.ImagePreviewActivity;
import com.friday.document.view.viewer.MicroClassPlayActivity;
import com.friday.document.view.viewer.PdfViewerActivity;
import com.friday.document.view.viewer.TxtEditActivity;
import com.friday.document.view.viewer.VideoPlayerActivity;
import com.friday.document.viewmodel.FolderViewModel;
import com.friday.document.viewmodel.ManualSyncViewModel;
import com.friday.document.viewmodel.NewestViewModel;
import com.friday.document.viewmodel.PdfViewerViewModel;
import com.friday.document.viewmodel.RecycleBinViewModel;
import com.friday.document.viewmodel.ShareBaseViewModel;
import com.friday.document.viewmodel.ShareByTeacherViewModel;
import com.friday.document.viewmodel.ShareFileViewModel;
import com.friday.document.viewmodel.StudentShareViewModel;
import com.friday.document.viewmodel.TeacherOnlyViewModel;
import com.friday.document.viewmodel.TxtEditViewModel;
import com.friday.lecture.view.LectureDialogFragment;
import com.friday.lecture.viewmodel.offline.LectureDialogViewModel;
import com.friday.login.view.LoginActivity;
import com.friday.login.view.SMSVerificationDialog;
import com.friday.login.viewmodel.LoginViewModel;
import com.friday.main.view.AppUpdateDialog;
import com.friday.main.view.DBActivity;
import com.friday.main.view.FolderMoveActivity;
import com.friday.main.view.FullScreenPreviewActivity;
import com.friday.main.view.HomeActivity;
import com.friday.main.view.HuiweiAppUpdateDialog;
import com.friday.main.view.SearchActivity;
import com.friday.main.viewmodel.DbViewModel;
import com.friday.main.viewmodel.FolderMoveViewModel;
import com.friday.main.viewmodel.FullScreenViewModel;
import com.friday.main.viewmodel.HomeViewModel;
import com.friday.main.viewmodel.SearchViewModel;
import com.friday.paint.view.NoteActivity;
import com.friday.paint.view.StudentPaintFragment;
import com.friday.paint.view.ThePaintFragment;
import com.friday.paint.view.TheSketchFragment;
import com.friday.paint.view.six.NewNoteActivity;
import com.friday.paint.view.six.NewPaintFragment;
import com.friday.paint.view.six.NewStudentPaintFragment;
import com.friday.paint.viewmodel.DoHomeworkViewModel;
import com.friday.paint.viewmodel.NewNoteViewModel;
import com.friday.paint.viewmodel.NoteViewModel;
import com.friday.paint.viewmodel.PaintViewModel;
import com.friday.user.view.AboutFragment;
import com.friday.user.view.HelpFragment;
import com.friday.user.view.PersonalInfoFragment;
import com.friday.user.view.UserFragment;
import com.friday.user.viewmodel.UserViewModel;
import com.zykj.cloudhelper.activity.NoteManagerActivity;
import com.zykj.cloudhelper.dialog.CreateFolderDialogFragment;
import com.zykj.cloudhelper.fragment.StoreNoteFragment;
import com.zykj.cloudhelper.viewmodel.PickNoteViewModel;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import ec.AbstractC9117b;
import ec.AbstractC9118c;
import ec.C9116a;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import je.C9742v;
import p003a2.AbstractC0046h;
import p012ab.AbstractC0101a;
import p028b2.AbstractC5146c;
import p028b2.AbstractC5147d;
import p028b2.AbstractC5148e;
import p028b2.AbstractC5149f;
import p036bc.InterfaceC5184a;
import p036bc.InterfaceC5185b;
import p036bc.InterfaceC5186c;
import p036bc.InterfaceC5187d;
import p040c2.InterfaceC5225a1;
import p040c2.InterfaceC5250g2;
import p040c2.InterfaceC5308v0;
import p041c3.AbstractC5323b;
import p041c3.AbstractC5324c;
import p041c3.C5322a;
import p042c4.AbstractC5336d1;
import p110d2.AbstractC8912b;
import p110d2.AbstractC8913c;
import p110d2.AbstractC8914d;
import p110d2.AbstractC8915e;
import p110d2.AbstractC8916f;
import p110d2.AbstractC8917g;
import p110d2.AbstractC8918h;
import p110d2.AbstractC8920j;
import p110d2.AbstractC8921k;
import p110d2.AbstractC8922l;
import p110d2.AbstractC8923m;
import p110d2.AbstractC8924n;
import p110d2.C8911a;
import p110d2.InterfaceC8919i;
import p112d4.AbstractC8977t0;
import p120dc.AbstractC9017c;
import p120dc.C9022h;
import p128e4.AbstractC9091a;
import p128e4.AbstractC9092b;
import p128e4.AbstractC9093c;
import p128e4.AbstractC9095e;
import p128e4.AbstractC9096f;
import p128e4.AbstractC9097g;
import p128e4.AbstractC9098h;
import p128e4.AbstractC9099i;
import p128e4.AbstractC9100j;
import p128e4.AbstractC9101k;
import p128e4.AbstractC9102l;
import p128e4.AbstractC9103m;
import p160g4.AbstractC9270b;
import p160g4.C9269a;
import p166gc.AbstractC9291e;
import p166gc.C9288b;
import p166gc.C9289c;
import p166gc.C9290d;
import p166gc.InterfaceC9292f;
import p170h2.C9454e;
import p170h2.C9455f;
import p172h4.AbstractC9491x;
import p188i4.AbstractC9604a;
import p188i4.AbstractC9605b;
import p188i4.AbstractC9606c;
import p200j2.InterfaceC9664d;
import p245m3.AbstractC10195a;
import p245m3.AbstractC10196b;
import p245m3.AbstractC10197c;
import p286p2.AbstractC10604b;
import p286p2.AbstractC10605c;
import p286p2.AbstractC10606d;
import p286p2.AbstractC10607e;
import p286p2.AbstractC10608f;
import p286p2.AbstractC10609g;
import p286p2.AbstractC10610h;
import p286p2.AbstractC10611i;
import p286p2.AbstractC10612j;
import p286p2.AbstractC10613k;
import p286p2.AbstractC10614l;
import p286p2.C10603a;
import p300q2.AbstractC10720b;
import p301q3.AbstractC10722a;
import p301q3.AbstractC10723b;
import p301q3.AbstractC10724c;
import p330s2.InterfaceC11051a;
import p330s2.InterfaceC11052b;
import p342t3.AbstractC11211b;
import p342t3.AbstractC11212c;
import p342t3.C11210a;
import p356u3.InterfaceC11364a;
import p356u3.InterfaceC11365b;
import p371v3.AbstractC11525u1;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p383w2.AbstractC11678i;
import p384w3.AbstractC11679a;
import p384w3.AbstractC11680b;
import p384w3.AbstractC11681c;
import p384w3.AbstractC11683e;
import p384w3.AbstractC11684f;
import p384w3.AbstractC11685g;
import p384w3.AbstractC11686h;
import p384w3.AbstractC11687i;
import p384w3.AbstractC11688j;
import p384w3.AbstractC11690l;
import p384w3.AbstractC11691m;
import p384w3.AbstractC11692n;
import p384w3.AbstractC11694p;
import p384w3.AbstractC11695q;
import p384w3.AbstractC11696r;
import p391wa.AbstractC11721b;
import p391wa.AbstractC11722c;
import p391wa.AbstractC11723d;
import p408xb.InterfaceC11823a;
import p408xb.InterfaceC11825c;
import p414y1.AbstractC11887a;
import p414y1.AbstractC11888b;
import p414y1.AbstractC11889c;
import p430z2.AbstractC11966a0;
import p430z2.AbstractC11967a1;
import p430z2.AbstractC11969b0;
import p430z2.AbstractC11971c;
import p430z2.AbstractC11972c0;
import p430z2.AbstractC11973d;
import p430z2.AbstractC11975e;
import p430z2.AbstractC11977f;
import p430z2.AbstractC11979g;
import p430z2.AbstractC11981h;
import p430z2.AbstractC11985j;
import p430z2.AbstractC11987k;
import p430z2.AbstractC11988k0;
import p430z2.AbstractC11989l;
import p430z2.AbstractC11990l0;
import p430z2.AbstractC11992m0;
import p430z2.AbstractC11993n;
import p430z2.AbstractC11995o;
import p430z2.AbstractC11997p;
import p430z2.AbstractC12000q0;
import p430z2.AbstractC12001r;
import p430z2.AbstractC12002r0;
import p430z2.AbstractC12003s;
import p430z2.AbstractC12004s0;
import p430z2.AbstractC12005t;
import p430z2.AbstractC12006t0;
import p430z2.AbstractC12008u0;
import p430z2.AbstractC12010v0;
import p430z2.AbstractC12011w;
import p430z2.AbstractC12013x;
import p430z2.AbstractC12015y;
import p430z2.AbstractC12016y0;
import p430z2.AbstractC12018z0;
import p431z3.AbstractC12020b;
import p431z3.C12019a;
import pa.InterfaceC10639a;
import sa.AbstractC11085b;
import sa.C11084a;
import sd.InterfaceC11122i0;
import za.AbstractC12032a;
import za.AbstractC12033b;
import za.AbstractC12034c;
import za.AbstractC12035d;

/* renamed from: w1.g */
/* loaded from: classes3.dex */
public abstract class AbstractC11666g {

    /* renamed from: w1.g$a */
    public static final class a implements InterfaceC5184a {

        /* renamed from: a */
        public final h f27685a;

        /* renamed from: b */
        public final d f27686b;

        /* renamed from: c */
        public Activity f27687c;

        @Override // p036bc.InterfaceC5184a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo2734a(Activity activity) {
            this.f27687c = (Activity) AbstractC9291e.m18322b(activity);
            return this;
        }

        @Override // p036bc.InterfaceC5184a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC11661b build() {
            AbstractC9291e.m18321a(this.f27687c, Activity.class);
            return new b(this.f27685a, this.f27686b, this.f27687c);
        }

        public a(h hVar, d dVar) {
            this.f27685a = hVar;
            this.f27686b = dVar;
        }
    }

    /* renamed from: w1.g$c */
    public static final class c implements InterfaceC5185b {

        /* renamed from: a */
        public final h f27691a;

        /* renamed from: b */
        public C9022h f27692b;

        @Override // p036bc.InterfaceC5185b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC11662c build() {
            AbstractC9291e.m18321a(this.f27692b, C9022h.class);
            return new d(this.f27691a, this.f27692b);
        }

        @Override // p036bc.InterfaceC5185b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo2735a(C9022h c9022h) {
            this.f27692b = (C9022h) AbstractC9291e.m18322b(c9022h);
            return this;
        }

        public c(h hVar) {
            this.f27691a = hVar;
        }
    }

    /* renamed from: w1.g$d */
    public static final class d extends AbstractC11662c {

        /* renamed from: a */
        public final h f27693a;

        /* renamed from: b */
        public final d f27694b = this;

        /* renamed from: c */
        public InterfaceC9292f f27695c;

        /* renamed from: w1.g$d$a */
        public static final class a implements InterfaceC9292f {

            /* renamed from: a */
            public final h f27696a;

            /* renamed from: b */
            public final d f27697b;

            /* renamed from: c */
            public final int f27698c;

            public a(h hVar, d dVar, int i10) {
                this.f27696a = hVar;
                this.f27697b = dVar;
                this.f27698c = i10;
            }

            @Override // p295pc.InterfaceC10652a
            public Object get() {
                if (this.f27698c == 0) {
                    return AbstractC9017c.m17617a();
                }
                throw new AssertionError(this.f27698c);
            }
        }

        public d(h hVar, C9022h c9022h) {
            this.f27693a = hVar;
            m25816c(c9022h);
        }

        @Override // p120dc.C9015a.a
        /* renamed from: a */
        public InterfaceC5184a mo17607a() {
            return new a(this.f27693a, this.f27694b);
        }

        @Override // p120dc.C9016b.d
        /* renamed from: b */
        public InterfaceC11823a mo17615b() {
            return (InterfaceC11823a) this.f27695c.get();
        }

        /* renamed from: c */
        public final void m25816c(C9022h c9022h) {
            this.f27695c = C9288b.m18313b(new a(this.f27693a, this.f27694b, 0));
        }
    }

    /* renamed from: w1.g$e */
    public static final class e {

        /* renamed from: a */
        public C9116a f27699a;

        /* renamed from: b */
        public C8911a f27700b;

        /* renamed from: c */
        public C10603a f27701c;

        /* renamed from: d */
        public C11210a f27702d;

        /* renamed from: e */
        public C5322a f27703e;

        /* renamed from: f */
        public C12019a f27704f;

        /* renamed from: g */
        public C11084a f27705g;

        /* renamed from: h */
        public C9269a f27706h;

        /* renamed from: a */
        public e m25817a(C9116a c9116a) {
            this.f27699a = (C9116a) AbstractC9291e.m18322b(c9116a);
            return this;
        }

        /* renamed from: b */
        public AbstractC11664e m25818b() {
            AbstractC9291e.m18321a(this.f27699a, C9116a.class);
            if (this.f27700b == null) {
                this.f27700b = new C8911a();
            }
            if (this.f27701c == null) {
                this.f27701c = new C10603a();
            }
            if (this.f27702d == null) {
                this.f27702d = new C11210a();
            }
            if (this.f27703e == null) {
                this.f27703e = new C5322a();
            }
            if (this.f27704f == null) {
                this.f27704f = new C12019a();
            }
            if (this.f27705g == null) {
                this.f27705g = new C11084a();
            }
            if (this.f27706h == null) {
                this.f27706h = new C9269a();
            }
            return new h(this.f27699a, this.f27700b, this.f27701c, this.f27702d, this.f27703e, this.f27704f, this.f27705g, this.f27706h);
        }

        public e() {
        }
    }

    /* renamed from: w1.g$f */
    public static final class f implements InterfaceC5186c {

        /* renamed from: a */
        public final h f27707a;

        /* renamed from: b */
        public final d f27708b;

        /* renamed from: c */
        public final b f27709c;

        /* renamed from: d */
        public Fragment f27710d;

        @Override // p036bc.InterfaceC5186c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC11663d build() {
            AbstractC9291e.m18321a(this.f27710d, Fragment.class);
            return new g(this.f27707a, this.f27708b, this.f27709c, this.f27710d);
        }

        @Override // p036bc.InterfaceC5186c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f mo2736a(Fragment fragment) {
            this.f27710d = (Fragment) AbstractC9291e.m18322b(fragment);
            return this;
        }

        public f(h hVar, d dVar, b bVar) {
            this.f27707a = hVar;
            this.f27708b = dVar;
            this.f27709c = bVar;
        }
    }

    /* renamed from: w1.g$i */
    public static final class i implements InterfaceC5187d {

        /* renamed from: a */
        public final h f27749a;

        /* renamed from: b */
        public final d f27750b;

        /* renamed from: c */
        public SavedStateHandle f27751c;

        /* renamed from: d */
        public InterfaceC11825c f27752d;

        @Override // p036bc.InterfaceC5187d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC11665f build() {
            AbstractC9291e.m18321a(this.f27751c, SavedStateHandle.class);
            AbstractC9291e.m18321a(this.f27752d, InterfaceC11825c.class);
            return new j(this.f27749a, this.f27750b, this.f27751c, this.f27752d);
        }

        @Override // p036bc.InterfaceC5187d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public i mo2737a(SavedStateHandle savedStateHandle) {
            this.f27751c = (SavedStateHandle) AbstractC9291e.m18322b(savedStateHandle);
            return this;
        }

        @Override // p036bc.InterfaceC5187d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public i mo2738b(InterfaceC11825c interfaceC11825c) {
            this.f27752d = (InterfaceC11825c) AbstractC9291e.m18322b(interfaceC11825c);
            return this;
        }

        public i(h hVar, d dVar) {
            this.f27749a = hVar;
            this.f27750b = dVar;
        }
    }

    /* renamed from: w1.g$j */
    public static final class j extends AbstractC11665f {

        /* renamed from: A */
        public InterfaceC9292f f27753A;

        /* renamed from: B */
        public InterfaceC9292f f27754B;

        /* renamed from: C */
        public InterfaceC9292f f27755C;

        /* renamed from: a */
        public final h f27756a;

        /* renamed from: b */
        public final d f27757b;

        /* renamed from: c */
        public final j f27758c = this;

        /* renamed from: d */
        public InterfaceC9292f f27759d;

        /* renamed from: e */
        public InterfaceC9292f f27760e;

        /* renamed from: f */
        public InterfaceC9292f f27761f;

        /* renamed from: g */
        public InterfaceC9292f f27762g;

        /* renamed from: h */
        public InterfaceC9292f f27763h;

        /* renamed from: i */
        public InterfaceC9292f f27764i;

        /* renamed from: j */
        public InterfaceC9292f f27765j;

        /* renamed from: k */
        public InterfaceC9292f f27766k;

        /* renamed from: l */
        public InterfaceC9292f f27767l;

        /* renamed from: m */
        public InterfaceC9292f f27768m;

        /* renamed from: n */
        public InterfaceC9292f f27769n;

        /* renamed from: o */
        public InterfaceC9292f f27770o;

        /* renamed from: p */
        public InterfaceC9292f f27771p;

        /* renamed from: q */
        public InterfaceC9292f f27772q;

        /* renamed from: r */
        public InterfaceC9292f f27773r;

        /* renamed from: s */
        public InterfaceC9292f f27774s;

        /* renamed from: t */
        public InterfaceC9292f f27775t;

        /* renamed from: u */
        public InterfaceC9292f f27776u;

        /* renamed from: v */
        public InterfaceC9292f f27777v;

        /* renamed from: w */
        public InterfaceC9292f f27778w;

        /* renamed from: x */
        public InterfaceC9292f f27779x;

        /* renamed from: y */
        public InterfaceC9292f f27780y;

        /* renamed from: z */
        public InterfaceC9292f f27781z;

        /* renamed from: w1.g$j$a */
        public static final class a implements InterfaceC9292f {

            /* renamed from: a */
            public final h f27782a;

            /* renamed from: b */
            public final d f27783b;

            /* renamed from: c */
            public final j f27784c;

            /* renamed from: d */
            public final int f27785d;

            public a(h hVar, d dVar, j jVar, int i10) {
                this.f27782a = hVar;
                this.f27783b = dVar;
                this.f27784c = jVar;
                this.f27785d = i10;
            }

            @Override // p295pc.InterfaceC10652a
            public Object get() {
                switch (this.f27785d) {
                    case 0:
                        return new CameraViewModel();
                    case 1:
                        return new DbViewModel((FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (InterfaceC5250g2) this.f27782a.f27732l.get(), (InterfaceC5308v0) this.f27782a.f27734n.get());
                    case 2:
                        return new DoHomeworkViewModel((UserDao) this.f27782a.f27735o.get());
                    case 3:
                        return new FolderMoveViewModel((FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (InterfaceC5308v0) this.f27782a.f27734n.get(), (InterfaceC11365b) this.f27782a.f27740t.get());
                    case 4:
                        return new FolderViewModel((FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (InterfaceC11051a) this.f27782a.f27741u.get(), (FileManager) this.f27782a.f27746z.get(), (FileRepository) this.f27782a.f27715A.get());
                    case 5:
                        return new FullScreenViewModel((FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (InterfaceC5250g2) this.f27782a.f27732l.get());
                    case 6:
                        return new HomeViewModel((InterfaceC11364a) this.f27782a.f27716B.get(), (StudentSession) this.f27782a.f27737q.get(), (FileDao) this.f27782a.f27733m.get(), (UserDao) this.f27782a.f27735o.get(), (InterfaceC11603l) this.f27782a.f27736p.get(), (InterfaceC11602k) this.f27782a.f27738r.get());
                    case 7:
                        return new LectureDialogViewModel();
                    case 8:
                        return new LoginViewModel((InterfaceC8919i) this.f27782a.f27742v.get(), (UserDao) this.f27782a.f27735o.get(), (InterfaceC11603l) this.f27782a.f27736p.get());
                    case 9:
                        return new MainViewModel((UserDao) this.f27782a.f27735o.get(), (StudentSession) this.f27782a.f27737q.get(), (InterfaceC8919i) this.f27782a.f27742v.get());
                    case 10:
                        return new ManualSyncViewModel((FileDao) this.f27782a.f27733m.get(), (FileManager) this.f27782a.f27746z.get());
                    case 11:
                        return new NewNoteViewModel((FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (UserDao) this.f27782a.f27735o.get(), (InterfaceC5308v0) this.f27782a.f27734n.get(), (InterfaceC9664d) this.f27782a.f27717C.get());
                    case 12:
                        return new NewestViewModel((FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (InterfaceC11051a) this.f27782a.f27741u.get(), (FileManager) this.f27782a.f27746z.get(), (FileRepository) this.f27782a.f27715A.get());
                    case 13:
                        return new NoteViewModel((FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (UserDao) this.f27782a.f27735o.get(), (InterfaceC5308v0) this.f27782a.f27734n.get());
                    case 14:
                        return new PaintViewModel();
                    case 15:
                        return new PdfViewerViewModel((InterfaceC5225a1) this.f27782a.f27718D.get());
                    case 16:
                        return new PickNoteViewModel((InterfaceC10639a) this.f27782a.f27719E.get(), (InterfaceC8919i) this.f27782a.f27742v.get(), (FileDao) this.f27782a.f27733m.get());
                    case 17:
                        return new RecycleBinViewModel((FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (InterfaceC11051a) this.f27782a.f27741u.get(), (FileManager) this.f27782a.f27746z.get());
                    case 18:
                        return new SearchViewModel((FileDao) this.f27782a.f27733m.get(), (InterfaceC9664d) this.f27782a.f27717C.get(), (InterfaceC11365b) this.f27782a.f27740t.get(), (ResourceDao) this.f27782a.f27731k.get());
                    case 19:
                        return new ShareBaseViewModel((InterfaceC11052b) this.f27782a.f27720F.get(), (InterfaceC5250g2) this.f27782a.f27732l.get(), (ResourceDao) this.f27782a.f27731k.get(), (FileManager) this.f27782a.f27746z.get());
                    case 20:
                        return new ShareByTeacherViewModel((InterfaceC11052b) this.f27782a.f27720F.get());
                    case 21:
                        return new ShareFileViewModel(AbstractC9118c.m17942a(this.f27782a.f27722b), (InterfaceC11052b) this.f27782a.f27720F.get());
                    case 22:
                        return new StudentShareViewModel((InterfaceC11052b) this.f27782a.f27720F.get(), (InterfaceC8919i) this.f27782a.f27742v.get(), (InterfaceC5250g2) this.f27782a.f27732l.get(), (ResourceDao) this.f27782a.f27731k.get(), (FileManager) this.f27782a.f27746z.get());
                    case 23:
                        return new TeacherOnlyViewModel((InterfaceC11051a) this.f27782a.f27741u.get(), (FileDao) this.f27782a.f27733m.get(), (FileManager) this.f27782a.f27746z.get());
                    case 24:
                        return new TxtEditViewModel((FileDao) this.f27782a.f27733m.get());
                    case 25:
                        return new UserViewModel((UserDao) this.f27782a.f27735o.get(), (FileDao) this.f27782a.f27733m.get(), (ResourceDao) this.f27782a.f27731k.get(), (InterfaceC5250g2) this.f27782a.f27732l.get(), (InterfaceC5308v0) this.f27782a.f27734n.get(), (InterfaceC8919i) this.f27782a.f27742v.get());
                    default:
                        throw new AssertionError(this.f27785d);
                }
            }
        }

        public j(h hVar, d dVar, SavedStateHandle savedStateHandle, InterfaceC11825c interfaceC11825c) {
            this.f27756a = hVar;
            this.f27757b = dVar;
            m25857c(savedStateHandle, interfaceC11825c);
            m25858d(savedStateHandle, interfaceC11825c);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC9011d
        /* renamed from: a */
        public Map mo17599a() {
            return C9289c.m18316a(C9290d.m18318b(26).m18320c(AbstractC5148e.f2980a, this.f27759d).m18320c(AbstractC11680b.f27791a, this.f27760e).m18320c(AbstractC9092b.f21264a, this.f27761f).m18320c(AbstractC11684f.f27797a, this.f27762g).m18320c(AbstractC11973d.f28350a, this.f27763h).m18320c(AbstractC11687i.f27799a, this.f27764i).m18320c(AbstractC11691m.f27803a, this.f27765j).m18320c(AbstractC10196b.f24278a, this.f27766k).m18320c(AbstractC10723b.f25796a, this.f27767l).m18320c(AbstractC11888b.f28203a, this.f27768m).m18320c(AbstractC11979g.f28355a, this.f27769n).m18320c(AbstractC9096f.f21266a, this.f27770o).m18320c(AbstractC11987k.f28363a, this.f27771p).m18320c(AbstractC9099i.f21268a, this.f27772q).m18320c(AbstractC9102l.f21270a, this.f27773r).m18320c(AbstractC11995o.f28370a, this.f27774s).m18320c(AbstractC11722c.f27884a, this.f27775t).m18320c(AbstractC12003s.f28376a, this.f27776u).m18320c(AbstractC11695q.f27807a, this.f27777v).m18320c(AbstractC12013x.f28384a, this.f27778w).m18320c(AbstractC11969b0.f28344a, this.f27779x).m18320c(AbstractC11990l0.f28365a, this.f27780y).m18320c(AbstractC12002r0.f28375a, this.f27781z).m18320c(AbstractC12008u0.f28379a, this.f27753A).m18320c(AbstractC12018z0.f28388a, this.f27754B).m18320c(AbstractC9605b.f22122a, this.f27755C).m18319a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC9011d
        /* renamed from: b */
        public Map mo17600b() {
            return Collections.EMPTY_MAP;
        }

        /* renamed from: c */
        public final void m25857c(SavedStateHandle savedStateHandle, InterfaceC11825c interfaceC11825c) {
            this.f27759d = new a(this.f27756a, this.f27757b, this.f27758c, 0);
            this.f27760e = new a(this.f27756a, this.f27757b, this.f27758c, 1);
            this.f27761f = new a(this.f27756a, this.f27757b, this.f27758c, 2);
            this.f27762g = new a(this.f27756a, this.f27757b, this.f27758c, 3);
            this.f27763h = new a(this.f27756a, this.f27757b, this.f27758c, 4);
            this.f27764i = new a(this.f27756a, this.f27757b, this.f27758c, 5);
            this.f27765j = new a(this.f27756a, this.f27757b, this.f27758c, 6);
            this.f27766k = new a(this.f27756a, this.f27757b, this.f27758c, 7);
            this.f27767l = new a(this.f27756a, this.f27757b, this.f27758c, 8);
            this.f27768m = new a(this.f27756a, this.f27757b, this.f27758c, 9);
            this.f27769n = new a(this.f27756a, this.f27757b, this.f27758c, 10);
            this.f27770o = new a(this.f27756a, this.f27757b, this.f27758c, 11);
            this.f27771p = new a(this.f27756a, this.f27757b, this.f27758c, 12);
            this.f27772q = new a(this.f27756a, this.f27757b, this.f27758c, 13);
            this.f27773r = new a(this.f27756a, this.f27757b, this.f27758c, 14);
            this.f27774s = new a(this.f27756a, this.f27757b, this.f27758c, 15);
            this.f27775t = new a(this.f27756a, this.f27757b, this.f27758c, 16);
            this.f27776u = new a(this.f27756a, this.f27757b, this.f27758c, 17);
            this.f27777v = new a(this.f27756a, this.f27757b, this.f27758c, 18);
            this.f27778w = new a(this.f27756a, this.f27757b, this.f27758c, 19);
            this.f27779x = new a(this.f27756a, this.f27757b, this.f27758c, 20);
            this.f27780y = new a(this.f27756a, this.f27757b, this.f27758c, 21);
            this.f27781z = new a(this.f27756a, this.f27757b, this.f27758c, 22);
            this.f27753A = new a(this.f27756a, this.f27757b, this.f27758c, 23);
            this.f27754B = new a(this.f27756a, this.f27757b, this.f27758c, 24);
        }

        /* renamed from: d */
        public final void m25858d(SavedStateHandle savedStateHandle, InterfaceC11825c interfaceC11825c) {
            this.f27755C = new a(this.f27756a, this.f27757b, this.f27758c, 25);
        }
    }

    /* renamed from: a */
    public static e m25801a() {
        return new e();
    }

    /* renamed from: w1.g$b */
    public static final class b extends AbstractC11661b {

        /* renamed from: a */
        public final h f27688a;

        /* renamed from: b */
        public final d f27689b;

        /* renamed from: c */
        public final b f27690c = this;

        public b(h hVar, d dVar, Activity activity) {
            this.f27688a = hVar;
            this.f27689b = dVar;
        }

        @Override // cc.AbstractC5418a.a
        /* renamed from: a */
        public AbstractC5418a.c mo2893a() {
            return AbstractC5419b.m2898a(mo17597e(), new i(this.f27688a, this.f27689b));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC9010c
        /* renamed from: e */
        public Map mo17597e() {
            return C9289c.m18316a(C9290d.m18318b(26).m18320c(AbstractC5149f.f2981a, Boolean.valueOf(AbstractC5147d.m2666a())).m18320c(AbstractC11681c.f27792a, Boolean.valueOf(AbstractC11679a.m25860a())).m18320c(AbstractC9093c.f21265a, Boolean.valueOf(AbstractC9091a.m17878a())).m18320c(AbstractC11685g.f27798a, Boolean.valueOf(AbstractC11683e.m25861a())).m18320c(AbstractC11975e.f28352a, Boolean.valueOf(AbstractC11971c.m26599a())).m18320c(AbstractC11688j.f27800a, Boolean.valueOf(AbstractC11686h.m25862a())).m18320c(AbstractC11692n.f27804a, Boolean.valueOf(AbstractC11690l.m25863a())).m18320c(AbstractC10197c.f24279a, Boolean.valueOf(AbstractC10195a.m21297a())).m18320c(AbstractC10724c.f25797a, Boolean.valueOf(AbstractC10722a.m22713a())).m18320c(AbstractC11889c.f28204a, Boolean.valueOf(AbstractC11887a.m26437a())).m18320c(AbstractC11981h.f28357a, Boolean.valueOf(AbstractC11977f.m26600a())).m18320c(AbstractC9097g.f21267a, Boolean.valueOf(AbstractC9095e.m17879a())).m18320c(AbstractC11989l.f28364a, Boolean.valueOf(AbstractC11985j.m26601a())).m18320c(AbstractC9100j.f21269a, Boolean.valueOf(AbstractC9098h.m17880a())).m18320c(AbstractC9103m.f21271a, Boolean.valueOf(AbstractC9101k.m17881a())).m18320c(AbstractC11997p.f28371a, Boolean.valueOf(AbstractC11993n.m26604a())).m18320c(AbstractC11723d.f27885a, Boolean.valueOf(AbstractC11721b.m25950a())).m18320c(AbstractC12005t.f28378a, Boolean.valueOf(AbstractC12001r.m26606a())).m18320c(AbstractC11696r.f27808a, Boolean.valueOf(AbstractC11694p.m25864a())).m18320c(AbstractC12015y.f28385a, Boolean.valueOf(AbstractC12011w.m26608a())).m18320c(AbstractC11972c0.f28349a, Boolean.valueOf(AbstractC11966a0.m26593a())).m18320c(AbstractC11992m0.f28368a, Boolean.valueOf(AbstractC11988k0.m26602a())).m18320c(AbstractC12004s0.f28377a, Boolean.valueOf(AbstractC12000q0.m26605a())).m18320c(AbstractC12010v0.f28381a, Boolean.valueOf(AbstractC12006t0.m26607a())).m18320c(AbstractC11967a1.f28343a, Boolean.valueOf(AbstractC12016y0.m26609a())).m18320c(AbstractC9606c.f22123a, Boolean.valueOf(AbstractC9604a.m18825a())).m18319a());
        }

        @Override // p003a2.InterfaceC0045g
        /* renamed from: i */
        public void mo91i(RequestScreenCastActivity requestScreenCastActivity) {
            m25813z(requestScreenCastActivity);
        }

        @Override // p371v3.InterfaceC11522t1
        /* renamed from: n */
        public void mo25383n(HomeActivity homeActivity) {
            m25812y(homeActivity);
        }

        @Override // p028b2.InterfaceC5145b
        /* renamed from: q */
        public void mo2664q(CameraActivity cameraActivity) {
            m25811x(cameraActivity);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC9010c
        /* renamed from: v */
        public InterfaceC5187d mo17598v() {
            return new i(this.f27688a, this.f27689b);
        }

        @Override // p120dc.C9021g.a
        /* renamed from: w */
        public InterfaceC5186c mo17624w() {
            return new f(this.f27688a, this.f27689b, this.f27690c);
        }

        /* renamed from: x */
        public final CameraActivity m25811x(CameraActivity cameraActivity) {
            AbstractC5146c.m2665a(cameraActivity, AbstractC5324c.m2819a(this.f27688a.f27723c));
            return cameraActivity;
        }

        /* renamed from: y */
        public final HomeActivity m25812y(HomeActivity homeActivity) {
            AbstractC11525u1.m25390g(homeActivity, AbstractC9270b.m18260a(this.f27688a.f27724d));
            AbstractC11525u1.m25384a(homeActivity, AbstractC10605c.m22455a(this.f27688a.f27725e));
            AbstractC11525u1.m25385b(homeActivity, AbstractC10608f.m22458a(this.f27688a.f27725e));
            AbstractC11525u1.m25386c(homeActivity, AbstractC5324c.m2819a(this.f27688a.f27723c));
            AbstractC11525u1.m25387d(homeActivity, AbstractC5323b.m2818a(this.f27688a.f27723c));
            AbstractC11525u1.m25389f(homeActivity, AbstractC10611i.m22461a(this.f27688a.f27725e));
            AbstractC11525u1.m25388e(homeActivity, AbstractC10610h.m22460a(this.f27688a.f27725e));
            return homeActivity;
        }

        /* renamed from: z */
        public final RequestScreenCastActivity m25813z(RequestScreenCastActivity requestScreenCastActivity) {
            AbstractC0046h.m92a(requestScreenCastActivity, AbstractC5323b.m2818a(this.f27688a.f27723c));
            return requestScreenCastActivity;
        }

        @Override // p415y2.InterfaceC11909t
        /* renamed from: b */
        public void mo25804b(VideoPlayerActivity videoPlayerActivity) {
        }

        @Override // p112d4.InterfaceC8929a
        /* renamed from: c */
        public void mo17529c(NewNoteActivity newNoteActivity) {
        }

        @Override // p287p3.InterfaceC10620f
        /* renamed from: d */
        public void mo22465d(LoginActivity loginActivity) {
        }

        @Override // p415y2.InterfaceC11900k
        /* renamed from: f */
        public void mo25805f(PdfViewerActivity pdfViewerActivity) {
        }

        @Override // qa.InterfaceC10766a
        /* renamed from: g */
        public void mo22939g(NoteManagerActivity noteManagerActivity) {
        }

        @Override // p415y2.InterfaceC11907r
        /* renamed from: h */
        public void mo25806h(TxtEditActivity txtEditActivity) {
        }

        @Override // p415y2.InterfaceC11898i
        /* renamed from: j */
        public void mo25807j(MicroClassPlayActivity microClassPlayActivity) {
        }

        @Override // p398x1.InterfaceC11759a
        /* renamed from: k */
        public void mo25808k(MainActivity mainActivity) {
        }

        @Override // p371v3.InterfaceC11539z0
        /* renamed from: l */
        public void mo25392l(FullScreenPreviewActivity fullScreenPreviewActivity) {
        }

        @Override // p042c4.InterfaceC5328b
        /* renamed from: m */
        public void mo2820m(NoteActivity noteActivity) {
        }

        @Override // p355u2.InterfaceC11352o0
        /* renamed from: o */
        public void mo25276o(TeacherOnlyActivity teacherOnlyActivity) {
        }

        @Override // p399x2.InterfaceC11782s
        /* renamed from: p */
        public void mo25809p(ShareSearchActivity shareSearchActivity) {
        }

        @Override // p371v3.InterfaceC11515r0
        /* renamed from: r */
        public void mo25382r(FolderMoveActivity folderMoveActivity) {
        }

        @Override // p415y2.InterfaceC11891b
        /* renamed from: s */
        public void mo25810s(ImagePreviewActivity imagePreviewActivity) {
        }

        @Override // p371v3.InterfaceC11483g2
        /* renamed from: t */
        public void mo25380t(SearchActivity searchActivity) {
        }

        @Override // p371v3.InterfaceC11494k0
        /* renamed from: u */
        public void mo25381u(DBActivity dBActivity) {
        }
    }

    /* renamed from: w1.g$g */
    public static final class g extends AbstractC11663d {

        /* renamed from: a */
        public final h f27711a;

        /* renamed from: b */
        public final d f27712b;

        /* renamed from: c */
        public final b f27713c;

        /* renamed from: d */
        public final g f27714d = this;

        public g(h hVar, d dVar, b bVar, Fragment fragment) {
            this.f27711a = hVar;
            this.f27712b = dVar;
            this.f27713c = bVar;
        }

        @Override // p172h4.InterfaceC9490w
        /* renamed from: I */
        public void mo18653I(UserFragment userFragment) {
            m25825N(userFragment);
        }

        /* renamed from: J */
        public final NewPaintFragment m25821J(NewPaintFragment newPaintFragment) {
            AbstractC8977t0.m17532a(newPaintFragment, AbstractC5324c.m2819a(this.f27711a.f27723c));
            return newPaintFragment;
        }

        /* renamed from: K */
        public final NewStudentPaintFragment m25822K(NewStudentPaintFragment newStudentPaintFragment) {
            AbstractC8977t0.m17532a(newStudentPaintFragment, AbstractC5324c.m2819a(this.f27711a.f27723c));
            return newStudentPaintFragment;
        }

        /* renamed from: L */
        public final StudentPaintFragment m25823L(StudentPaintFragment studentPaintFragment) {
            AbstractC5336d1.m2822a(studentPaintFragment, AbstractC5324c.m2819a(this.f27711a.f27723c));
            return studentPaintFragment;
        }

        /* renamed from: M */
        public final ThePaintFragment m25824M(ThePaintFragment thePaintFragment) {
            AbstractC5336d1.m2822a(thePaintFragment, AbstractC5324c.m2819a(this.f27711a.f27723c));
            return thePaintFragment;
        }

        /* renamed from: N */
        public final UserFragment m25825N(UserFragment userFragment) {
            AbstractC9491x.m18656c(userFragment, new PersonalInfoFragment());
            AbstractC9491x.m18654a(userFragment, new AboutFragment());
            AbstractC9491x.m18655b(userFragment, new HelpFragment());
            return userFragment;
        }

        /* renamed from: O */
        public final VideoPreviewFragment m25826O(VideoPreviewFragment videoPreviewFragment) {
            AbstractC11678i.m25859a(videoPreviewFragment, (InterfaceC5250g2) this.f27711a.f27732l.get());
            return videoPreviewFragment;
        }

        @Override // cc.AbstractC5418a.b
        /* renamed from: a */
        public AbstractC5418a.c mo2894a() {
            return this.f27713c.mo2893a();
        }

        @Override // p042c4.InterfaceC5373q
        /* renamed from: b */
        public void mo2823b(StudentPaintFragment studentPaintFragment) {
            m25823L(studentPaintFragment);
        }

        @Override // p112d4.InterfaceC8975s0
        /* renamed from: f */
        public void mo17531f(NewPaintFragment newPaintFragment) {
            m25821J(newPaintFragment);
        }

        @Override // p112d4.InterfaceC8955i1
        /* renamed from: k */
        public void mo17530k(NewStudentPaintFragment newStudentPaintFragment) {
            m25822K(newStudentPaintFragment);
        }

        @Override // p042c4.InterfaceC5333c1
        /* renamed from: m */
        public void mo2821m(ThePaintFragment thePaintFragment) {
            m25824M(thePaintFragment);
        }

        @Override // p383w2.InterfaceC11677h
        /* renamed from: u */
        public void mo25832u(VideoPreviewFragment videoPreviewFragment) {
            m25826O(videoPreviewFragment);
        }

        @Override // p172h4.InterfaceC9484q
        /* renamed from: A */
        public void mo18652A(PersonalInfoFragment personalInfoFragment) {
        }

        @Override // p028b2.InterfaceC5162s
        /* renamed from: B */
        public void mo2669B(ImagePickFragment imagePickFragment) {
        }

        @Override // p355u2.InterfaceC11344k0
        /* renamed from: C */
        public void mo25274C(RecycleBinPreviewFragment recycleBinPreviewFragment) {
        }

        @Override // p370v2.InterfaceC11429h0
        /* renamed from: D */
        public void mo25372D(NewestFragment newestFragment) {
        }

        @Override // p042c4.InterfaceC5393w1
        /* renamed from: E */
        public void mo2824E(TheSketchFragment theSketchFragment) {
        }

        @Override // p355u2.InterfaceC11343k
        /* renamed from: F */
        public void mo25273F(FolderPreviewFragment folderPreviewFragment) {
        }

        @Override // p172h4.InterfaceC9473f
        /* renamed from: G */
        public void mo18650G(AboutFragment aboutFragment) {
        }

        @Override // p028b2.InterfaceC5154k
        /* renamed from: H */
        public void mo2668H(ImageCropFragment imageCropFragment) {
        }

        @Override // p355u2.InterfaceC11351o
        /* renamed from: c */
        public void mo25275c(ManualSyncFileDialog manualSyncFileDialog) {
        }

        @Override // p172h4.InterfaceC9479l
        /* renamed from: d */
        public void mo18651d(HelpFragment helpFragment) {
        }

        @Override // p399x2.InterfaceC11767d0
        /* renamed from: e */
        public void mo25827e(StudentSharePreviewFragment studentSharePreviewFragment) {
        }

        @Override // p371v3.InterfaceC11534x1
        /* renamed from: g */
        public void mo25391g(HuiweiAppUpdateDialog huiweiAppUpdateDialog) {
        }

        @Override // p383w2.InterfaceC11676g
        /* renamed from: h */
        public void mo25828h(TxtPreviewFragment txtPreviewFragment) {
        }

        @Override // p370v2.InterfaceC11436l
        /* renamed from: i */
        public void mo25373i(FileListFragment fileListFragment) {
        }

        @Override // p232l3.InterfaceC10135g
        /* renamed from: j */
        public void mo21138j(LectureDialogFragment lectureDialogFragment) {
        }

        @Override // va.InterfaceC11570r
        /* renamed from: l */
        public void mo25471l(StoreNoteFragment storeNoteFragment) {
        }

        @Override // p399x2.InterfaceC11775l
        /* renamed from: n */
        public void mo25829n(ShareListFragment shareListFragment) {
        }

        @Override // p370v2.InterfaceC11445p0
        /* renamed from: o */
        public void mo25374o(RecycleBinFragment recycleBinFragment) {
        }

        @Override // p371v3.InterfaceC11468d
        /* renamed from: p */
        public void mo25376p(AppUpdateDialog appUpdateDialog) {
        }

        @Override // p287p3.InterfaceC10626l
        /* renamed from: q */
        public void mo22466q(SMSVerificationDialog sMSVerificationDialog) {
        }

        @Override // p349ta.InterfaceC11262c
        /* renamed from: r */
        public void mo25190r(CreateFolderDialogFragment createFolderDialogFragment) {
        }

        @Override // p399x2.InterfaceC11774k
        /* renamed from: s */
        public void mo25830s(ShareByTeacherFragment shareByTeacherFragment) {
        }

        @Override // p399x2.InterfaceC11786w
        /* renamed from: t */
        public void mo25831t(ShareTeacherFileFragment shareTeacherFileFragment) {
        }

        @Override // p355u2.InterfaceC11363z
        /* renamed from: v */
        public void mo25277v(NewestPreviewFragment newestPreviewFragment) {
        }

        @Override // p399x2.InterfaceC11769f
        /* renamed from: w */
        public void mo25833w(ShareBaseFileFragment shareBaseFileFragment) {
        }

        @Override // p370v2.InterfaceC11452w
        /* renamed from: x */
        public void mo25375x(FolderFragment folderFragment) {
        }

        @Override // p383w2.InterfaceC11675f
        /* renamed from: y */
        public void mo25834y(PdfPreviewFragment pdfPreviewFragment) {
        }

        @Override // p399x2.InterfaceC11763b0
        /* renamed from: z */
        public void mo25835z(StudentShareFragment studentShareFragment) {
        }
    }

    /* renamed from: w1.g$h */
    public static final class h extends AbstractC11664e {

        /* renamed from: A */
        public InterfaceC9292f f27715A;

        /* renamed from: B */
        public InterfaceC9292f f27716B;

        /* renamed from: C */
        public InterfaceC9292f f27717C;

        /* renamed from: D */
        public InterfaceC9292f f27718D;

        /* renamed from: E */
        public InterfaceC9292f f27719E;

        /* renamed from: F */
        public InterfaceC9292f f27720F;

        /* renamed from: a */
        public final C8911a f27721a;

        /* renamed from: b */
        public final C9116a f27722b;

        /* renamed from: c */
        public final C5322a f27723c;

        /* renamed from: d */
        public final C9269a f27724d;

        /* renamed from: e */
        public final C10603a f27725e;

        /* renamed from: f */
        public final C11210a f27726f;

        /* renamed from: g */
        public final C12019a f27727g;

        /* renamed from: h */
        public final C11084a f27728h;

        /* renamed from: i */
        public final h f27729i = this;

        /* renamed from: j */
        public InterfaceC9292f f27730j;

        /* renamed from: k */
        public InterfaceC9292f f27731k;

        /* renamed from: l */
        public InterfaceC9292f f27732l;

        /* renamed from: m */
        public InterfaceC9292f f27733m;

        /* renamed from: n */
        public InterfaceC9292f f27734n;

        /* renamed from: o */
        public InterfaceC9292f f27735o;

        /* renamed from: p */
        public InterfaceC9292f f27736p;

        /* renamed from: q */
        public InterfaceC9292f f27737q;

        /* renamed from: r */
        public InterfaceC9292f f27738r;

        /* renamed from: s */
        public InterfaceC9292f f27739s;

        /* renamed from: t */
        public InterfaceC9292f f27740t;

        /* renamed from: u */
        public InterfaceC9292f f27741u;

        /* renamed from: v */
        public InterfaceC9292f f27742v;

        /* renamed from: w */
        public InterfaceC9292f f27743w;

        /* renamed from: x */
        public InterfaceC9292f f27744x;

        /* renamed from: y */
        public InterfaceC9292f f27745y;

        /* renamed from: z */
        public InterfaceC9292f f27746z;

        /* renamed from: w1.g$h$a */
        public static final class a implements InterfaceC9292f {

            /* renamed from: a */
            public final h f27747a;

            /* renamed from: b */
            public final int f27748b;

            public a(h hVar, int i10) {
                this.f27747a = hVar;
                this.f27748b = i10;
            }

            @Override // p295pc.InterfaceC10652a
            public Object get() {
                switch (this.f27748b) {
                    case 0:
                        return AbstractC8916f.m17505a(this.f27747a.f27721a, (MyDataBase) this.f27747a.f27730j.get());
                    case 1:
                        return AbstractC8912b.m17501a(this.f27747a.f27721a, AbstractC9117b.m17941a(this.f27747a.f27722b));
                    case 2:
                        return AbstractC8917g.m17506a(this.f27747a.f27721a, (MyDataBase) this.f27747a.f27730j.get());
                    case 3:
                        return AbstractC8913c.m17502a(this.f27747a.f27721a, (MyDataBase) this.f27747a.f27730j.get());
                    case 4:
                        return AbstractC8914d.m17503a(this.f27747a.f27721a, (MyDataBase) this.f27747a.f27730j.get());
                    case 5:
                        return AbstractC8918h.m17507a(this.f27747a.f27721a, (MyDataBase) this.f27747a.f27730j.get());
                    case 6:
                        return AbstractC11212c.m24930a(this.f27747a.f27726f, this.f27747a.m25845m());
                    case 7:
                        return new StudentSession((InterfaceC11603l) this.f27747a.f27736p.get());
                    case 8:
                        return AbstractC8922l.m17514a();
                    case 9:
                        return AbstractC8924n.m17516a();
                    case 10:
                        return new RefreshRepositoryImpl((InterfaceC11603l) this.f27747a.f27736p.get());
                    case 11:
                        return AbstractC10606d.m22456a(this.f27747a.f27725e, this.f27747a.m25845m());
                    case 12:
                        return AbstractC10607e.m22457a(this.f27747a.f27725e, (InterfaceC8919i) this.f27747a.f27742v.get(), (StudentSession) this.f27747a.f27737q.get(), (FileDao) this.f27747a.f27733m.get(), (ResourceDao) this.f27747a.f27731k.get(), AbstractC12020b.m26611a(this.f27747a.f27727g), (SyncStateOne) this.f27747a.f27743w.get(), (SyncStateThree) this.f27747a.f27744x.get(), (InterfaceC5250g2) this.f27747a.f27732l.get(), (InterfaceC11122i0) this.f27747a.f27745y.get());
                    case 13:
                        return AbstractC8921k.m17513a(this.f27747a.m25852t());
                    case 14:
                        return AbstractC10613k.m22463a(this.f27747a.f27725e, (InterfaceC11051a) this.f27747a.f27741u.get(), (InterfaceC8919i) this.f27747a.f27742v.get(), (FileDao) this.f27747a.f27733m.get(), (ResourceDao) this.f27747a.f27731k.get(), (InterfaceC5308v0) this.f27747a.f27734n.get());
                    case 15:
                        return AbstractC10614l.m22464a(this.f27747a.f27725e, (InterfaceC11051a) this.f27747a.f27741u.get(), (FileDao) this.f27747a.f27733m.get(), (ResourceDao) this.f27747a.f27731k.get());
                    case 16:
                        return AbstractC10604b.m22454a(this.f27747a.f27725e);
                    case 17:
                        return new FileRepository((ResourceDao) this.f27747a.f27731k.get(), (FileDao) this.f27747a.f27733m.get(), (InterfaceC5308v0) this.f27747a.f27734n.get());
                    case 18:
                        return AbstractC11211b.m24929a(this.f27747a.f27726f, this.f27747a.m25852t());
                    case 19:
                        return AbstractC10609g.m22459a(this.f27747a.f27725e, (FileManager) this.f27747a.f27746z.get());
                    case 20:
                        return AbstractC8915e.m17504a(this.f27747a.f27721a, (MyDataBase) this.f27747a.f27730j.get());
                    case 21:
                        return AbstractC11085b.m24663a(this.f27747a.f27728h, this.f27747a.m25845m());
                    case 22:
                        return AbstractC10612j.m22462a(this.f27747a.f27725e, this.f27747a.m25845m());
                    default:
                        throw new AssertionError(this.f27748b);
                }
            }
        }

        public h(C9116a c9116a, C8911a c8911a, C10603a c10603a, C11210a c11210a, C5322a c5322a, C12019a c12019a, C11084a c11084a, C9269a c9269a) {
            this.f27721a = c8911a;
            this.f27722b = c9116a;
            this.f27723c = c5322a;
            this.f27724d = c9269a;
            this.f27725e = c10603a;
            this.f27726f = c11210a;
            this.f27727g = c12019a;
            this.f27728h = c11084a;
            m25847o(c9116a, c8911a, c10603a, c11210a, c5322a, c12019a, c11084a, c9269a);
        }

        @Override // p300q2.InterfaceC10719a
        /* renamed from: a */
        public void mo22710a(AliMessageReceiver aliMessageReceiver) {
            m25848p(aliMessageReceiver);
        }

        @Override // p438zb.AbstractC12036a.a
        /* renamed from: b */
        public Set mo25844b() {
            return Collections.EMPTY_SET;
        }

        @Override // p120dc.C9016b.b
        /* renamed from: d */
        public InterfaceC5185b mo17612d() {
            return new c(this.f27729i);
        }

        /* renamed from: m */
        public C9742v m25845m() {
            return AbstractC8920j.m17512a(new NetworkInterceptor(), m25853u(), m25846n(), m25851s(), new C9454e(), new C9455f());
        }

        /* renamed from: n */
        public HeadInterceptor m25846n() {
            return m25849q(AbstractC12032a.m26657a());
        }

        /* renamed from: o */
        public final void m25847o(C9116a c9116a, C8911a c8911a, C10603a c10603a, C11210a c11210a, C5322a c5322a, C12019a c12019a, C11084a c11084a, C9269a c9269a) {
            this.f27730j = C9288b.m18313b(new a(this.f27729i, 1));
            this.f27731k = C9288b.m18313b(new a(this.f27729i, 0));
            this.f27732l = C9288b.m18313b(new a(this.f27729i, 2));
            this.f27733m = C9288b.m18313b(new a(this.f27729i, 3));
            this.f27734n = C9288b.m18313b(new a(this.f27729i, 4));
            this.f27735o = C9288b.m18313b(new a(this.f27729i, 5));
            this.f27736p = C9288b.m18313b(new a(this.f27729i, 8));
            this.f27737q = C9288b.m18313b(new a(this.f27729i, 7));
            this.f27738r = C9288b.m18313b(new a(this.f27729i, 9));
            this.f27739s = C9288b.m18313b(new a(this.f27729i, 10));
            this.f27740t = C9288b.m18313b(new a(this.f27729i, 6));
            this.f27741u = C9288b.m18313b(new a(this.f27729i, 11));
            this.f27742v = C9288b.m18313b(new a(this.f27729i, 13));
            this.f27743w = C9288b.m18313b(new a(this.f27729i, 14));
            this.f27744x = C9288b.m18313b(new a(this.f27729i, 15));
            this.f27745y = C9288b.m18313b(new a(this.f27729i, 16));
            this.f27746z = C9288b.m18313b(new a(this.f27729i, 12));
            this.f27715A = C9288b.m18313b(new a(this.f27729i, 17));
            this.f27716B = C9288b.m18313b(new a(this.f27729i, 18));
            this.f27717C = C9288b.m18313b(new a(this.f27729i, 19));
            this.f27718D = C9288b.m18313b(new a(this.f27729i, 20));
            this.f27719E = C9288b.m18313b(new a(this.f27729i, 21));
            this.f27720F = C9288b.m18313b(new a(this.f27729i, 22));
        }

        /* renamed from: p */
        public final AliMessageReceiver m25848p(AliMessageReceiver aliMessageReceiver) {
            AbstractC10720b.m22711a(aliMessageReceiver, (ResourceDao) this.f27731k.get());
            return aliMessageReceiver;
        }

        /* renamed from: q */
        public final HeadInterceptor m25849q(HeadInterceptor headInterceptor) {
            AbstractC12033b.m26658a(headInterceptor, (InterfaceC11603l) this.f27736p.get());
            return headInterceptor;
        }

        /* renamed from: r */
        public final RefreshTokenInterceptor m25850r(RefreshTokenInterceptor refreshTokenInterceptor) {
            AbstractC12035d.m26661b(refreshTokenInterceptor, (InterfaceC11602k) this.f27738r.get());
            AbstractC12035d.m26660a(refreshTokenInterceptor, (AbstractC0101a) this.f27739s.get());
            return refreshTokenInterceptor;
        }

        /* renamed from: s */
        public RefreshTokenInterceptor m25851s() {
            return m25850r(AbstractC12034c.m26659a());
        }

        /* renamed from: t */
        public C9742v m25852t() {
            return AbstractC8923m.m17515a(new NetworkInterceptor(), m25853u(), m25846n(), m25851s());
        }

        /* renamed from: u */
        public StudentSessionInterceptor m25853u() {
            return new StudentSessionInterceptor((StudentSession) this.f27737q.get());
        }

        @Override // p382w1.InterfaceC11660a
        /* renamed from: c */
        public void mo25800c(App app) {
        }
    }
}
