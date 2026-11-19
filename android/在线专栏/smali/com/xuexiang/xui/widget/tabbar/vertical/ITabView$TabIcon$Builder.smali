.class public Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mIconGravity:I

.field private mIconHeight:I

.field private mIconWidth:I

.field private mMargin:I

.field private mNormalIcon:I

.field private mSelectedIcon:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mSelectedIcon:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mNormalIcon:I

    const/4 v1, -0x1

    .line 4
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconWidth:I

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconHeight:I

    const v1, 0x800003

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconGravity:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mMargin:I

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mSelectedIcon:I

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mNormalIcon:I

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconGravity:I

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconWidth:I

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconHeight:I

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mMargin:I

    return p0
.end method


# virtual methods
.method public build()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;
    .locals 2

    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;-><init>(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$1;)V

    return-object v0
.end method

.method public setIcon(II)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mSelectedIcon:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mNormalIcon:I

    return-object p0
.end method

.method public setIconGravity(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;
    .locals 4

    const v0, 0x800003

    if-eq p1, v0, :cond_4

    const v0, 0x800005

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v3, 0x30

    if-eq p1, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    and-int/2addr v0, v3

    const/16 v3, 0x50

    if-eq p1, v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v0, v1

    if-nez v0, :cond_3

    goto :goto_3

    .line 1
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "iconGravity only support Gravity.START or Gravity.END or Gravity.TOP or Gravity.BOTTOM"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2
    :cond_4
    :goto_3
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconGravity:I

    return-object p0
.end method

.method public setIconMargin(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mMargin:I

    return-object p0
.end method

.method public setIconSize(II)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconWidth:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->mIconHeight:I

    return-object p0
.end method
