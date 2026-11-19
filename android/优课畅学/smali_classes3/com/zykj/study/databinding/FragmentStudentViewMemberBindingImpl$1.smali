.class Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/databinding/InverseBindingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl;


# direct methods
.method public constructor <init>(Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl$1;->this$0:Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onChange()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl$1;->this$0:Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->getTextString(Landroid/widget/TextView;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl$1;->this$0:Lcom/zykj/study/databinding/FragmentStudentViewMemberBindingImpl;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->mViewModel:Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
