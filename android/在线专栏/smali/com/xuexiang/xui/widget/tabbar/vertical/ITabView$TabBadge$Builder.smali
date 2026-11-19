.class public Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private badgeGravity:I

.field private badgeNumber:I

.field private badgePadding:F

.field private badgeText:Ljava/lang/String;

.field private badgeTextSize:F

.field private colorBackground:I

.field private colorBadgeText:I

.field private colorStroke:I

.field private dragStateChangedListener:Lcom/xuexiang/xui/widget/textview/badge/Badge$OnDragStateChangedListener;

.field private drawableBackground:Landroid/graphics/drawable/Drawable;

.field private drawableBackgroundClip:Z

.field private exactMode:Z

.field private gravityOffsetX:I

.field private gravityOffsetY:I

.field private showShadow:Z

.field private strokeWidth:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0x17b1c0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorBackground:I

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorBadgeText:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorStroke:I

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->drawableBackground:Landroid/graphics/drawable/Drawable;

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->drawableBackgroundClip:Z

    const/4 v2, 0x0

    .line 7
    iput v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->strokeWidth:F

    const/high16 v2, 0x41300000    # 11.0f

    .line 8
    iput v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeTextSize:F

    const/high16 v2, 0x40a00000    # 5.0f

    .line 9
    iput v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgePadding:F

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeNumber:I

    .line 11
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeText:Ljava/lang/String;

    const v1, 0x800035

    .line 12
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeGravity:I

    const/4 v1, 0x1

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->gravityOffsetX:I

    .line 14
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->gravityOffsetY:I

    .line 15
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->exactMode:Z

    .line 16
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->showShadow:Z

    return-void
.end method

.method static synthetic access$1200(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorBackground:I

    return p0
.end method

.method static synthetic access$1300(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorBadgeText:I

    return p0
.end method

.method static synthetic access$1400(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeTextSize:F

    return p0
.end method

.method static synthetic access$1500(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgePadding:F

    return p0
.end method

.method static synthetic access$1600(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeNumber:I

    return p0
.end method

.method static synthetic access$1700(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeText:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1800(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeGravity:I

    return p0
.end method

.method static synthetic access$1900(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->gravityOffsetX:I

    return p0
.end method

.method static synthetic access$2000(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->gravityOffsetY:I

    return p0
.end method

.method static synthetic access$2100(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->exactMode:Z

    return p0
.end method

.method static synthetic access$2200(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->showShadow:Z

    return p0
.end method

.method static synthetic access$2300(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)Landroid/graphics/drawable/Drawable;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->drawableBackground:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic access$2400(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorStroke:I

    return p0
.end method

.method static synthetic access$2500(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->drawableBackgroundClip:Z

    return p0
.end method

.method static synthetic access$2600(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->strokeWidth:F

    return p0
.end method

.method static synthetic access$2700(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;)Lcom/xuexiang/xui/widget/textview/badge/Badge$OnDragStateChangedListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->dragStateChangedListener:Lcom/xuexiang/xui/widget/textview/badge/Badge$OnDragStateChangedListener;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;
    .locals 2

    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;-><init>(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$1;)V

    return-object v0
.end method

.method public setBackgroundColor(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorBackground:I

    return-object p0
.end method

.method public setBadgeGravity(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeGravity:I

    return-object p0
.end method

.method public setBadgeNumber(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeNumber:I

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeText:Ljava/lang/String;

    return-object p0
.end method

.method public setBadgePadding(F)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgePadding:F

    return-object p0
.end method

.method public setBadgeText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeText:Ljava/lang/String;

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeNumber:I

    return-object p0
.end method

.method public setBadgeTextColor(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorBadgeText:I

    return-object p0
.end method

.method public setBadgeTextSize(F)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->badgeTextSize:F

    return-object p0
.end method

.method public setDrawableBackground(Landroid/graphics/drawable/Drawable;Z)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->drawableBackground:Landroid/graphics/drawable/Drawable;

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->drawableBackgroundClip:Z

    return-object p0
.end method

.method public setExactMode(Z)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->exactMode:Z

    return-object p0
.end method

.method public setGravityOffset(II)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->gravityOffsetX:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->gravityOffsetY:I

    return-object p0
.end method

.method public setOnDragStateChangedListener(Lcom/xuexiang/xui/widget/textview/badge/Badge$OnDragStateChangedListener;)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->dragStateChangedListener:Lcom/xuexiang/xui/widget/textview/badge/Badge$OnDragStateChangedListener;

    return-object p0
.end method

.method public setShowShadow(Z)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->showShadow:Z

    return-object p0
.end method

.method public stroke(II)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->colorStroke:I

    int-to-float p1, p2

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->strokeWidth:F

    return-object p0
.end method
