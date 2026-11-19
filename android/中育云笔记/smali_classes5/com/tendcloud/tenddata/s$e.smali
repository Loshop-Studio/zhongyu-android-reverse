.class Lcom/tendcloud/tenddata/s$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field final activityName:Ljava/lang/String;

.field final rootView:Landroid/view/View;

.field scale:F

.field screenshot:Lcom/tendcloud/tenddata/s$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/s$e;->activityName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/tenddata/s$e;->rootView:Landroid/view/View;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/tendcloud/tenddata/s$e;->screenshot:Lcom/tendcloud/tenddata/s$a;

    .line 10
    .line 11
    const/high16 p1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput p1, p0, Lcom/tendcloud/tenddata/s$e;->scale:F

    .line 14
    .line 15
    return-void
.end method
