package com.zykj.mistake.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Messenger;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.blankj.utilcode.util.AbstractC3386f;
import com.blankj.utilcode.util.HandlerC3388h;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.databinding.ActivityMistakeCreateOrEditBinding;
import com.zykj.mistake.databinding.IncludeMistakeDetailEndBinding;
import com.zykj.mistake.entity.EditMistakeData;
import com.zykj.mistake.entity.req.CreateOrUpdateMistakeReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.SubjectResp;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.MistakeCreateOrEditPresenter;
import com.zykj.mistake.utils.AbstractC5101f;
import com.zykj.mistake.utils.C5100e;
import com.zykj.mistake.utils.C5102g;
import com.zykj.mistake.widget.FlowLayout;
import com.zykj.view.utils.ImagePicker;
import io.reactivex.internal.operators.observable.C5706b;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.angmarch.views.NiceSpinner;
import p006a5.ViewOnClickListenerC0015f;
import p016b0.AbstractC3085o;
import p021b5.C3190b;
import p030c6.AbstractC3234f;
import p045d6.InterfaceC5429e;
import p095k1.C5752a;
import p147r0.C6446d;
import p151r5.AbstractC6465b;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;", "Lcom/zykj/mistake/base/BaseMVPActivity;", "Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;", "Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;", "", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeCreateOrEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCreateOrEditActivity.kt\ncom/zykj/mistake/activity/MistakeCreateOrEditActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1137:1\n257#2,2:1138\n257#2,2:1140\n257#2,2:1142\n257#2,2:1144\n257#2,2:1146\n257#2,2:1148\n257#2,2:1186\n257#2,2:1190\n1#3:1150\n1563#4:1151\n1634#4,3:1152\n774#4:1155\n865#4,2:1156\n1869#4,2:1158\n774#4:1160\n865#4,2:1161\n1869#4,2:1163\n1761#4,3:1165\n1761#4,3:1168\n1761#4,3:1171\n1761#4,3:1174\n1869#4:1177\n1761#4,3:1178\n1870#4:1181\n1869#4,2:1188\n295#4,2:1192\n12637#5,2:1182\n12434#5,2:1184\n*S KotlinDebug\n*F\n+ 1 MistakeCreateOrEditActivity.kt\ncom/zykj/mistake/activity/MistakeCreateOrEditActivity\n*L\n318#1:1138,2\n328#1:1140,2\n348#1:1142,2\n352#1:1144,2\n415#1:1146,2\n416#1:1148,2\n156#1:1186,2\n385#1:1190,2\n498#1:1151\n498#1:1152,3\n555#1:1155\n555#1:1156,2\n555#1:1158,2\n557#1:1160\n557#1:1161,2\n558#1:1163,2\n907#1:1165,3\n912#1:1168,3\n917#1:1171,3\n922#1:1174,3\n926#1:1177\n927#1:1178,3\n926#1:1181\n256#1:1188,2\n689#1:1192,2\n1038#1:1182,2\n1126#1:1184,2\n*E\n"})
/* loaded from: classes3.dex */
public class MistakeCreateOrEditActivity extends BaseMVPActivity<MistakeCreateOrEditPresenter, ActivityMistakeCreateOrEditBinding> {

    /* renamed from: u */
    public static final /* synthetic */ int f5799u = 0;

    /* renamed from: m */
    public boolean f5808m;

    /* renamed from: o */
    public EditMistakeData f5810o;

    /* renamed from: e */
    public final ArrayList f5800e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f5801f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f5802g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f5803h = new ArrayList();

    /* renamed from: i */
    public final int f5804i = 6;

    /* renamed from: j */
    public final InterfaceC5429e f5805j = AbstractC5773a.m5117b(new C4473i(this, 0));

    /* renamed from: k */
    public final ImagePicker f5806k = new ImagePicker(null, this, 1, null == true ? 1 : 0);

    /* renamed from: l */
    public final String f5807l = AbstractC5101f.m4464b("CreateMistake/Pictures");

    /* renamed from: n */
    public final InterfaceC5429e f5809n = AbstractC5773a.m5117b(new C4473i(this, 1));

    /* renamed from: p */
    public final String[] f5811p = {"", "", "", ""};

    /* renamed from: q */
    public final Integer[] f5812q = {0, 0, 0, 0};

    /* renamed from: r */
    public final CreateOrUpdateMistakeReq f5813r = new CreateOrUpdateMistakeReq();

    /* renamed from: s */
    public final C5102g f5814s = new C5102g(this);

    /* renamed from: t */
    public final Messenger f5815t = new Messenger(new HandlerC3388h(this, 2));

    /* renamed from: C */
    public static void m3911C(ImageView imageView, boolean z8) {
        imageView.setBackgroundResource(z8 ? R.drawable.bg_mistake_create_solid_box : R.drawable.bg_mistake_create_dash_box);
    }

    /* renamed from: u */
    public static void m3912u(View view) {
        ViewParent parent = view.getParent();
        AbstractC5830k.m5328e(parent, "null cannot be cast to non-null type com.zykj.mistake.widget.FlowLayout");
        FlowLayout flowLayout = (FlowLayout) parent;
        int childCount = flowLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            flowLayout.getChildAt(i).setSelected(false);
        }
        view.setSelected(true);
    }

    /* renamed from: v */
    public static View m3913v(MistakeCreateOrEditActivity mistakeCreateOrEditActivity, CustomTagInfo customTagInfo, boolean z8, int i) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        boolean z9 = (i & 4) == 0;
        mistakeCreateOrEditActivity.getClass();
        View viewInflate = LayoutInflater.from(mistakeCreateOrEditActivity).inflate(R.layout.item_mistake_tag, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_item_tag_content);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_add);
        viewInflate.setSelected(z8);
        if (z9) {
            textView.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            textView.setVisibility(0);
            imageView.setVisibility(8);
            textView.setText(customTagInfo.getName());
        }
        imageView.setOnClickListener(new ViewOnClickListenerC4474j(mistakeCreateOrEditActivity, 1));
        int i8 = 0;
        textView.setOnClickListener(new ViewOnClickListenerC4475k(viewInflate, mistakeCreateOrEditActivity, customTagInfo, i8));
        textView.setOnLongClickListener(new ViewOnLongClickListenerC4476l(i8, customTagInfo, mistakeCreateOrEditActivity));
        return viewInflate;
    }

    /* renamed from: A */
    public final void m3914A() {
        mo3963c();
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6019b.setClickable(true);
        String string = getString(R.string.edit_mistake_success);
        AbstractC5830k.m5329f(string, "getString(...)");
        mo3962b(string);
        Intent intent = new Intent();
        intent.putExtra("EDIT_MISTAKE_DATA", AbstractC3386f.m2337a().m2787f(this.f5813r));
        SubjectResp.Subject subject = (SubjectResp.Subject) AbstractC5805t.m5230j0(((ActivityMistakeCreateOrEditBinding) m3957p()).f6037t.getSelectedIndex(), this.f5800e);
        String content = subject != null ? subject.getContent() : null;
        if (content == null) {
            content = "";
        }
        intent.putExtra("EDIT_MISTAKE_SUBJECT_NAME", content);
        intent.putExtra("EDIT_MISTAKE_TAGS", AbstractC3386f.m2337a().m2787f(this.f5801f));
        setResult(-1, intent);
        finish();
    }

    /* renamed from: B */
    public final void m3915B(String str, String str2, Uri uri, int i, ImageView imageView, ImageView imageView2) {
        mo3964d(true);
        new C5706b(new C4481q(this, uri, str, str2)).m6079d(AbstractC3234f.f1799a).m6077a(AbstractC6465b.m6127a()).m6078b(new C4484t(i, imageView, imageView2, this));
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: o */
    public final int mo3905o() {
        return R.layout.activity_mistake_create_or_edit;
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: q */
    public final void mo3906q() {
        String title;
        String stemShoot;
        List<String> stem;
        List<String> stem2;
        List<CustomTagInfo> tag;
        List<String> answer;
        List<String> answer2;
        List<String> stem3;
        List<String> stem4;
        this.f5810o = (EditMistakeData) AbstractC3386f.m2337a().m2784c(getIntent().getStringExtra("editMistakeData"), new C5752a(EditMistakeData.class));
        NiceSpinner niceSpinner = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6037t;
        niceSpinner.setSelected(true);
        niceSpinner.setOnSpinnerItemSelectedListener(new C4482r(this));
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6020c.setDrawerLockMode(1);
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6038u.setText(getString(this.f5810o != null ? R.string.edit_mistake : R.string.custom_mistake));
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6025h.setOnClickListener(new ViewOnClickListenerC4474j(this, 3));
        EditText editText = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6021d;
        EditMistakeData editMistakeData = this.f5810o;
        if (editMistakeData == null || (title = editMistakeData.getTitle()) == null) {
            title = "";
        }
        editText.setText(title);
        String str = null;
        if (getIntent().getBooleanExtra("isCustomMistake", true)) {
            ImageView ivFirstStem = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6029l;
            AbstractC5830k.m5329f(ivFirstStem, "ivFirstStem");
            AppCompatImageView ivFirstStemDelete = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6031n;
            AbstractC5830k.m5329f(ivFirstStemDelete, "ivFirstStemDelete");
            EditMistakeData editMistakeData2 = this.f5810o;
            m3920y(0, ivFirstStem, ivFirstStemDelete, (editMistakeData2 == null || (stem4 = editMistakeData2.getStem()) == null) ? null : (String) AbstractC5805t.m5230j0(0, stem4));
            ImageView ivSecondStem = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6034q;
            AbstractC5830k.m5329f(ivSecondStem, "ivSecondStem");
            AppCompatImageView ivSecondStemDelete = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6036s;
            AbstractC5830k.m5329f(ivSecondStemDelete, "ivSecondStemDelete");
            EditMistakeData editMistakeData3 = this.f5810o;
            m3920y(1, ivSecondStem, ivSecondStemDelete, (editMistakeData3 == null || (stem3 = editMistakeData3.getStem()) == null) ? null : (String) AbstractC5805t.m5230j0(1, stem3));
            ImageView ivFirstAnswer = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6027j;
            AbstractC5830k.m5329f(ivFirstAnswer, "ivFirstAnswer");
            AppCompatImageView ivFirstAnswerDelete = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6028k;
            AbstractC5830k.m5329f(ivFirstAnswerDelete, "ivFirstAnswerDelete");
            EditMistakeData editMistakeData4 = this.f5810o;
            m3920y(2, ivFirstAnswer, ivFirstAnswerDelete, (editMistakeData4 == null || (answer2 = editMistakeData4.getAnswer()) == null) ? null : (String) AbstractC5805t.m5230j0(0, answer2));
            ImageView ivSecondAnswer = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6032o;
            AbstractC5830k.m5329f(ivSecondAnswer, "ivSecondAnswer");
            AppCompatImageView ivSecondAnswerDelete = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6033p;
            AbstractC5830k.m5329f(ivSecondAnswerDelete, "ivSecondAnswerDelete");
            EditMistakeData editMistakeData5 = this.f5810o;
            if (editMistakeData5 != null && (answer = editMistakeData5.getAnswer()) != null) {
                str = (String) AbstractC5805t.m5230j0(1, answer);
            }
            m3920y(3, ivSecondAnswer, ivSecondAnswerDelete, str);
        } else {
            ImageView ivFirstStem2 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6029l;
            AbstractC5830k.m5329f(ivFirstStem2, "ivFirstStem");
            ImageView ivFirstStemBackground = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6030m;
            AbstractC5830k.m5329f(ivFirstStemBackground, "ivFirstStemBackground");
            EditMistakeData editMistakeData6 = this.f5810o;
            if (editMistakeData6 == null || (stem2 = editMistakeData6.getStem()) == null || (stemShoot = (String) AbstractC5805t.m5230j0(0, stem2)) == null) {
                EditMistakeData editMistakeData7 = this.f5810o;
                stemShoot = editMistakeData7 != null ? editMistakeData7.getStemShoot() : null;
            }
            m3919x(ivFirstStem2, ivFirstStemBackground, stemShoot);
            ImageView ivSecondStem2 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6034q;
            AbstractC5830k.m5329f(ivSecondStem2, "ivSecondStem");
            ImageView ivSecondStemBackground = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6035r;
            AbstractC5830k.m5329f(ivSecondStemBackground, "ivSecondStemBackground");
            EditMistakeData editMistakeData8 = this.f5810o;
            if (editMistakeData8 != null && (stem = editMistakeData8.getStem()) != null) {
                str = (String) AbstractC5805t.m5230j0(1, stem);
            }
            m3919x(ivSecondStem2, ivSecondStemBackground, str);
            Group groupAnswer = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6023f;
            AbstractC5830k.m5329f(groupAnswer, "groupAnswer");
            groupAnswer.setVisibility(8);
            EditText editText2 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6021d;
            ViewGroup.LayoutParams layoutParams = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6021d.getLayoutParams();
            AbstractC5830k.m5328e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.endToEnd = R.id.view_fixed_content_width_anchor;
            editText2.setLayoutParams(layoutParams2);
            FlowLayout flowLayout = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6022e;
            ViewGroup.LayoutParams layoutParams3 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6022e.getLayoutParams();
            AbstractC5830k.m5328e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.endToEnd = R.id.view_fixed_content_width_anchor;
            flowLayout.setLayoutParams(layoutParams4);
            Group groupPhotoTip = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6024g;
            AbstractC5830k.m5329f(groupPhotoTip, "groupPhotoTip");
            groupPhotoTip.setVisibility(8);
        }
        ArrayList arrayList = this.f5801f;
        arrayList.clear();
        EditMistakeData editMistakeData9 = this.f5810o;
        if (editMistakeData9 != null && (tag = editMistakeData9.getTag()) != null) {
            arrayList.addAll(tag);
        }
        m3921z(arrayList);
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6018a.setOnClickListener(new ViewOnClickListenerC4474j(this, 4));
        TextView btnMainConfirm = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6019b;
        AbstractC5830k.m5329f(btnMainConfirm, "btnMainConfirm");
        C5100e.m4461e(btnMainConfirm, new C4473i(this, 2));
        IncludeMistakeDetailEndBinding includeMistakeDetailEndBinding = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i;
        includeMistakeDetailEndBinding.f6160j.setText(getString(R.string.add_mistake_tag));
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6155e.removeAllViews();
        FlowLayout flowLayout2 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6155e;
        String string = getString(R.string.easy);
        AbstractC5830k.m5329f(string, "getString(...)");
        flowLayout2.addView(m3913v(this, new CustomTagInfo(string, 1L, 0, 0, 4, null), false, 6));
        FlowLayout flowLayout3 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6155e;
        String string2 = getString(R.string.normal);
        AbstractC5830k.m5329f(string2, "getString(...)");
        flowLayout3.addView(m3913v(this, new CustomTagInfo(string2, 2L, 0, 0, 4, null), false, 6));
        FlowLayout flowLayout4 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6155e;
        String string3 = getString(R.string.hard);
        AbstractC5830k.m5329f(string3, "getString(...)");
        flowLayout4.addView(m3913v(this, new CustomTagInfo(string3, 3L, 0, 0, 4, null), false, 6));
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6156f.removeAllViews();
        FlowLayout flowLayout5 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6156f;
        String string4 = getString(R.string.unknow);
        AbstractC5830k.m5329f(string4, "getString(...)");
        flowLayout5.addView(m3913v(this, new CustomTagInfo(string4, 1L, 0, 1, 4, null), false, 6));
        FlowLayout flowLayout6 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6156f;
        String string5 = getString(R.string.generally);
        AbstractC5830k.m5329f(string5, "getString(...)");
        flowLayout6.addView(m3913v(this, new CustomTagInfo(string5, 2L, 0, 1, 4, null), false, 6));
        FlowLayout flowLayout7 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6156f;
        String string6 = getString(R.string.obviously);
        AbstractC5830k.m5329f(string6, "getString(...)");
        flowLayout7.addView(m3913v(this, new CustomTagInfo(string6, 3L, 0, 1, 4, null), false, 6));
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6157g.removeAllViews();
        FlowLayout flowLayout8 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6157g;
        String string7 = getString(R.string.concept);
        AbstractC5830k.m5329f(string7, "getString(...)");
        flowLayout8.addView(m3913v(this, new CustomTagInfo(string7, 1L, 0, 2, 4, null), false, 6));
        FlowLayout flowLayout9 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6157g;
        String string8 = getString(R.string.examination);
        AbstractC5830k.m5329f(string8, "getString(...)");
        flowLayout9.addView(m3913v(this, new CustomTagInfo(string8, 2L, 0, 2, 4, null), false, 6));
        FlowLayout flowLayout10 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6157g;
        String string9 = getString(R.string.calculate);
        AbstractC5830k.m5329f(string9, "getString(...)");
        flowLayout10.addView(m3913v(this, new CustomTagInfo(string9, 3L, 0, 2, 4, null), false, 6));
        FlowLayout flowLayout11 = ((ActivityMistakeCreateOrEditBinding) m3957p()).f6026i.f6157g;
        String string10 = getString(R.string.careless);
        AbstractC5830k.m5329f(string10, "getString(...)");
        flowLayout11.addView(m3913v(this, new CustomTagInfo(string10, 4L, 0, 2, 4, null), false, 6));
        includeMistakeDetailEndBinding.f6152b.setOnClickListener(new ViewOnClickListenerC4474j(this, 2));
        includeMistakeDetailEndBinding.f6151a.setOnClickListener(new ViewOnClickListenerC0015f(4, this, includeMistakeDetailEndBinding));
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: s */
    public final Class mo3916s() {
        return MistakeCreateOrEditPresenter.class;
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: t */
    public final void mo3917t() {
        String stemShoot;
        List<String> answer;
        List<String> stem;
        boolean booleanExtra = getIntent().getBooleanExtra("isCustomMistake", true);
        CreateOrUpdateMistakeReq createOrUpdateMistakeReq = this.f5813r;
        if (booleanExtra) {
            EditMistakeData editMistakeData = this.f5810o;
            createOrUpdateMistakeReq.setId(editMistakeData != null ? Long.valueOf(editMistakeData.getId()) : null);
            EditMistakeData editMistakeData2 = this.f5810o;
            if (editMistakeData2 == null || (stemShoot = editMistakeData2.getStemShoot()) == null) {
                stemShoot = "";
            }
            createOrUpdateMistakeReq.setStemShoot(stemShoot);
            ArrayList<String> arrayList = new ArrayList<>();
            EditMistakeData editMistakeData3 = this.f5810o;
            if (editMistakeData3 != null && (stem = editMistakeData3.getStem()) != null) {
                arrayList.addAll(stem);
            }
            createOrUpdateMistakeReq.setExtraStems(arrayList);
            ArrayList<String> arrayList2 = new ArrayList<>();
            EditMistakeData editMistakeData4 = this.f5810o;
            if (editMistakeData4 != null && (answer = editMistakeData4.getAnswer()) != null) {
                arrayList2.addAll(answer);
            }
            createOrUpdateMistakeReq.setExtraAnswers(arrayList2);
        } else {
            EditMistakeData editMistakeData5 = this.f5810o;
            createOrUpdateMistakeReq.setId(editMistakeData5 != null ? Long.valueOf(editMistakeData5.getId()) : null);
            createOrUpdateMistakeReq.setStemShoot(null);
            createOrUpdateMistakeReq.setExtraStems(null);
            createOrUpdateMistakeReq.setExtraAnswers(null);
        }
        MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter = (MistakeCreateOrEditPresenter) m3965r();
        C5088a c5088a = C5088a.f7986a;
        mistakeCreateOrEditPresenter.m3969a(C5088a.m4381b().m4403u(), new C3190b(mistakeCreateOrEditPresenter, 4));
        MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter2 = (MistakeCreateOrEditPresenter) m3965r();
        mistakeCreateOrEditPresenter2.m3970b(C5088a.m4381b().m4395m("com.zykj.mistake"), new C3190b(mistakeCreateOrEditPresenter2, 0), false);
    }

    /* renamed from: w */
    public final View m3918w(CustomTagInfo customTagInfo, boolean z8) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.item_mistake_tag_delete, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_item_tag_content);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_item_tag_delete);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_add);
        if (z8) {
            textView.setVisibility(8);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
        } else {
            textView.setVisibility(0);
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            textView.setText(customTagInfo.getName());
        }
        imageView2.setOnClickListener(new ViewOnClickListenerC4474j(this, 0));
        imageView.setOnClickListener(new ViewOnClickListenerC0015f(3, this, customTagInfo));
        return viewInflate;
    }

    /* renamed from: x */
    public final void m3919x(ImageView imageView, ImageView imageView2, String str) {
        if (str != null) {
            ComponentCallbacks2C3408b.m2361d(this).m5863c(this).m2386l(str).mo2374c(((C6446d) new C6446d().m6086g(AbstractC3085o.f1480b)).m6096r()).m2378y(imageView);
            imageView.setSelected(true);
            m3911C(imageView, true);
        } else {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
        imageView.setOnClickListener(new ViewOnClickListenerC0015f(2, str, this));
    }

    /* renamed from: y */
    public final void m3920y(int i, ImageView imageView, AppCompatImageView appCompatImageView, String str) {
        if (str != null) {
            ComponentCallbacks2C3408b.m2361d(this).m5863c(this).m2386l(str).mo2374c(((C6446d) new C6446d().m6086g(AbstractC3085o.f1480b)).m6096r()).m2378y(imageView);
            imageView.setSelected(true);
            m3911C(imageView, true);
            appCompatImageView.setVisibility(0);
        } else {
            imageView.setSelected(false);
            m3911C(imageView, false);
            appCompatImageView.setVisibility(8);
        }
        imageView.setOnClickListener(new ViewOnClickListenerC4483s(imageView, this, i, str, appCompatImageView));
        appCompatImageView.setOnClickListener(new ViewOnClickListenerC4483s(i, this, str, imageView, appCompatImageView));
    }

    /* renamed from: z */
    public final void m3921z(ArrayList arrayList) {
        ((ActivityMistakeCreateOrEditBinding) m3957p()).f6022e.removeAllViews();
        if (arrayList.size() < this.f5804i) {
            ((ActivityMistakeCreateOrEditBinding) m3957p()).f6022e.addView(m3918w(new CustomTagInfo(null, 0L, 0, 0, 15, null), true));
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ActivityMistakeCreateOrEditBinding) m3957p()).f6022e.addView(m3918w((CustomTagInfo) obj, false));
        }
    }
}
