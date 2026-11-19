.class public final Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "content",
        "",
        "setContent",
        "(Ljava/lang/String;)V",
        "Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;",
        "a",
        "Lkotlin/Lazy;",
        "getBinding",
        "()Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;",
        "binding",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    sget-object v1, Lcom/zykj/huiwei/launcher/R$styleable;->MenuItemView:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, 0x3

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 7
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 8
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    .line 9
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->getBinding()Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v3, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->getBinding()Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->getBinding()Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;->tvContent:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->getBinding()Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;->groupEnter:Landroidx/constraintlayout/widget/Group;

    const-string v0, "groupEnter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 13
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    new-instance p2, Lh4/e;

    invoke-direct {p2, p1, p0}, Lh4/e;-><init>(Landroid/content/Context;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->a:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;)Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->b(Landroid/content/Context;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;)Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/content/Context;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;)Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f0c0057

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {p0, v0, p1, v1}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    .line 14
    .line 15
    return-object p0
.end method

.method private final getBinding()Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->a:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValue(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final setContent(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->getBinding()Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;->tvContent:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
