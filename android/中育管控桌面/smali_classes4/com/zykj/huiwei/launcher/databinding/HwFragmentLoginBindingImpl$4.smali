.class Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/databinding/InverseBindingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$4;->this$0:Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$4;->this$0:Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->policyCheckView:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$4;->this$0:Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
