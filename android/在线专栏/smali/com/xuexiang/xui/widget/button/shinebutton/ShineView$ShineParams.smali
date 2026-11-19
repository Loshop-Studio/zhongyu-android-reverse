.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShineParams"
.end annotation


# instance fields
.field public allowRandomColor:Z

.field public animDuration:J

.field public bigShineColor:I

.field public clickAnimDuration:J

.field public enableFlashing:Z

.field public shineCount:I

.field public shineDistanceMultiple:F

.field public shineSize:I

.field public shineTurnAngle:F

.field public smallShineColor:I

.field public smallShineOffsetAngle:F


# direct methods
.method constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->allowRandomColor:Z

    const-wide/16 v1, 0x5dc

    .line 3
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->animDuration:J

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->bigShineColor:I

    const-wide/16 v1, 0xc8

    .line 5
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->clickAnimDuration:J

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->enableFlashing:Z

    const/4 v1, 0x7

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineCount:I

    const/high16 v2, 0x41a00000    # 20.0f

    .line 8
    iput v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineTurnAngle:F

    const/high16 v3, 0x3fc00000    # 1.5f

    .line 9
    iput v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineDistanceMultiple:F

    .line 10
    iput v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineOffsetAngle:F

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineColor:I

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineSize:I

    .line 13
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v2

    const-string v3, "#FFFF99"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v2, v0

    .line 14
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    const-string v2, "#FFCCCC"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    aput v2, v0, v3

    .line 15
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    const-string v2, "#996699"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    aput v2, v0, v3

    .line 16
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    const-string v2, "#FF6666"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x3

    aput v2, v0, v3

    .line 17
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    const-string v2, "#FFFF66"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x4

    aput v2, v0, v3

    .line 18
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    const-string v2, "#F44336"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x5

    aput v2, v0, v3

    .line 19
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    const-string v2, "#666666"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x6

    aput v3, v0, v4

    .line 20
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    const-string v3, "#CCCC00"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v0, v1

    .line 21
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x8

    aput v1, v0, v2

    .line 22
    invoke-static {}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1400()[I

    move-result-object v0

    const-string v1, "#999933"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x9

    aput v1, v0, v2

    return-void
.end method
