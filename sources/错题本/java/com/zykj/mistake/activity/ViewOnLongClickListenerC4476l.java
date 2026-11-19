package com.zykj.mistake.activity;

import android.util.SparseArray;
import android.view.View;
import com.chad.library.adapter.base.BaseBinderAdapter;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.presenter.MistakeCreateOrEditPresenter;
import com.zykj.mistake.presenter.MistakeDetailPresenter;
import com.zykj.mistake.presenter.MistakeListPresenter;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p106l4.DialogC6058i;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.activity.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC4476l implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5914a;

    /* renamed from: b */
    public final /* synthetic */ Object f5915b;

    /* renamed from: c */
    public final /* synthetic */ Object f5916c;

    public /* synthetic */ ViewOnLongClickListenerC4476l(int i, Object obj, Object obj2) {
        this.f5914a = i;
        this.f5915b = obj;
        this.f5916c = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [d6.e, java.lang.Object] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View it) {
        int i = this.f5914a;
        Object obj = this.f5916c;
        Object obj2 = this.f5915b;
        switch (i) {
            case 0:
                CustomTagInfo customTagInfo = (CustomTagInfo) obj2;
                final MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) obj;
                int i8 = MistakeCreateOrEditActivity.f5799u;
                if (customTagInfo.getLocalType() == -1) {
                    final String name = customTagInfo.getName();
                    final long id = customTagInfo.getId();
                    DialogC6058i dialogC6058i = (DialogC6058i) mistakeCreateOrEditActivity.f5805j.getValue();
                    String string = mistakeCreateOrEditActivity.getString(R.string.edit_mistake_tag);
                    AbstractC5830k.m5329f(string, "getString(...)");
                    final int i9 = 0;
                    dialogC6058i.m5787a(string, name, new InterfaceC6471c() { // from class: com.zykj.mistake.activity.n
                        @Override // p152r6.InterfaceC6471c
                        public final Object invoke(Object obj3) {
                            int i10 = i9;
                            C5443s c5443s = C5443s.f8405a;
                            String str = name;
                            long j7 = id;
                            BaseMVPActivity baseMVPActivity = mistakeCreateOrEditActivity;
                            switch (i10) {
                                case 0:
                                    String it2 = (String) obj3;
                                    int i11 = MistakeCreateOrEditActivity.f5799u;
                                    AbstractC5830k.m5330g(it2, "it");
                                    ((MistakeCreateOrEditPresenter) ((MistakeCreateOrEditActivity) baseMVPActivity).m3965r()).m4435c(j7, it2, str);
                                    break;
                                case 1:
                                    String it3 = (String) obj3;
                                    int i12 = MistakeDetailActivity.f5816s;
                                    AbstractC5830k.m5330g(it3, "it");
                                    ((MistakeDetailPresenter) ((MistakeDetailActivity) baseMVPActivity).m3965r()).m4436c(j7, it3, str);
                                    break;
                                default:
                                    String it4 = (String) obj3;
                                    int i13 = MistakeListActivity.f5831x;
                                    AbstractC5830k.m5330g(it4, "it");
                                    ((MistakeListPresenter) ((MistakeListActivity) baseMVPActivity).m3965r()).m4437c(j7, it4, str);
                                    break;
                            }
                            return c5443s;
                        }
                    });
                }
                return true;
            case 1:
                CustomTagInfo customTagInfo2 = (CustomTagInfo) obj2;
                final MistakeDetailActivity mistakeDetailActivity = (MistakeDetailActivity) obj;
                int i10 = MistakeDetailActivity.f5816s;
                if (customTagInfo2.getLocalType() == -1) {
                    final String name2 = customTagInfo2.getName();
                    final long id2 = customTagInfo2.getId();
                    DialogC6058i dialogC6058i2 = mistakeDetailActivity.f5819g;
                    if (dialogC6058i2 == null) {
                        AbstractC5830k.m5339p("mMistakeTagDialog");
                        throw null;
                    }
                    String string2 = mistakeDetailActivity.getString(R.string.edit_mistake_tag);
                    AbstractC5830k.m5329f(string2, "getString(...)");
                    final int i11 = 1;
                    dialogC6058i2.m5787a(string2, name2, new InterfaceC6471c() { // from class: com.zykj.mistake.activity.n
                        @Override // p152r6.InterfaceC6471c
                        public final Object invoke(Object obj3) {
                            int i102 = i11;
                            C5443s c5443s = C5443s.f8405a;
                            String str = name2;
                            long j7 = id2;
                            BaseMVPActivity baseMVPActivity = mistakeDetailActivity;
                            switch (i102) {
                                case 0:
                                    String it2 = (String) obj3;
                                    int i112 = MistakeCreateOrEditActivity.f5799u;
                                    AbstractC5830k.m5330g(it2, "it");
                                    ((MistakeCreateOrEditPresenter) ((MistakeCreateOrEditActivity) baseMVPActivity).m3965r()).m4435c(j7, it2, str);
                                    break;
                                case 1:
                                    String it3 = (String) obj3;
                                    int i12 = MistakeDetailActivity.f5816s;
                                    AbstractC5830k.m5330g(it3, "it");
                                    ((MistakeDetailPresenter) ((MistakeDetailActivity) baseMVPActivity).m3965r()).m4436c(j7, it3, str);
                                    break;
                                default:
                                    String it4 = (String) obj3;
                                    int i13 = MistakeListActivity.f5831x;
                                    AbstractC5830k.m5330g(it4, "it");
                                    ((MistakeListPresenter) ((MistakeListActivity) baseMVPActivity).m3965r()).m4437c(j7, it4, str);
                                    break;
                            }
                            return c5443s;
                        }
                    });
                }
                return true;
            case 2:
                final MistakeListActivity mistakeListActivity = (MistakeListActivity) obj;
                CustomTagInfo customTagInfo3 = (CustomTagInfo) obj2;
                if (!mistakeListActivity.f5850w && customTagInfo3.getLocalType() == -1) {
                    final String name3 = customTagInfo3.getName();
                    final long id3 = customTagInfo3.getId();
                    DialogC6058i dialogC6058i3 = mistakeListActivity.f5835h;
                    if (dialogC6058i3 == null) {
                        AbstractC5830k.m5339p("mMistakeTagDialog");
                        throw null;
                    }
                    String string3 = mistakeListActivity.getString(R.string.edit_mistake_tag);
                    AbstractC5830k.m5329f(string3, "getString(...)");
                    final int i12 = 2;
                    dialogC6058i3.m5787a(string3, name3, new InterfaceC6471c() { // from class: com.zykj.mistake.activity.n
                        @Override // p152r6.InterfaceC6471c
                        public final Object invoke(Object obj3) {
                            int i102 = i12;
                            C5443s c5443s = C5443s.f8405a;
                            String str = name3;
                            long j7 = id3;
                            BaseMVPActivity baseMVPActivity = mistakeListActivity;
                            switch (i102) {
                                case 0:
                                    String it2 = (String) obj3;
                                    int i112 = MistakeCreateOrEditActivity.f5799u;
                                    AbstractC5830k.m5330g(it2, "it");
                                    ((MistakeCreateOrEditPresenter) ((MistakeCreateOrEditActivity) baseMVPActivity).m3965r()).m4435c(j7, it2, str);
                                    break;
                                case 1:
                                    String it3 = (String) obj3;
                                    int i122 = MistakeDetailActivity.f5816s;
                                    AbstractC5830k.m5330g(it3, "it");
                                    ((MistakeDetailPresenter) ((MistakeDetailActivity) baseMVPActivity).m3965r()).m4436c(j7, it3, str);
                                    break;
                                default:
                                    String it4 = (String) obj3;
                                    int i13 = MistakeListActivity.f5831x;
                                    AbstractC5830k.m5330g(it4, "it");
                                    ((MistakeListPresenter) ((MistakeListActivity) baseMVPActivity).m3965r()).m4437c(j7, it4, str);
                                    break;
                            }
                            return c5443s;
                        }
                    });
                }
                return true;
            case 3:
                BaseViewHolder viewHolder = (BaseViewHolder) obj2;
                BaseBinderAdapter baseBinderAdapter = (BaseBinderAdapter) obj;
                AbstractC5830k.m5330g(viewHolder, "$viewHolder");
                if (viewHolder.getBindingAdapterPosition() == -1) {
                    return false;
                }
                baseBinderAdapter.m2499j(viewHolder.getItemViewType());
                throw null;
            default:
                BaseViewHolder viewHolder2 = (BaseViewHolder) obj2;
                BaseProviderMultiAdapter baseProviderMultiAdapter = (BaseProviderMultiAdapter) obj;
                AbstractC5830k.m5330g(viewHolder2, "$viewHolder");
                int bindingAdapterPosition = viewHolder2.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return false;
                }
                if (((SparseArray) baseProviderMultiAdapter.f2643e.getValue()).get(viewHolder2.getItemViewType()) != null) {
                    throw new ClassCastException();
                }
                AbstractC5830k.m5329f(it, "it");
                baseProviderMultiAdapter.f2645b.get(bindingAdapterPosition);
                throw null;
        }
    }

    public /* synthetic */ ViewOnLongClickListenerC4476l(MistakeListActivity mistakeListActivity, CustomTagInfo customTagInfo) {
        this.f5914a = 2;
        this.f5916c = mistakeListActivity;
        this.f5915b = customTagInfo;
    }
}
