.class public Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:I

.field public h:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
