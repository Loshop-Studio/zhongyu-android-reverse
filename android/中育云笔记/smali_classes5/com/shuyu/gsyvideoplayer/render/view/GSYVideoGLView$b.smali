.class public Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr7/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->e(Landroid/content/Context;Landroid/view/ViewGroup;ILr7/c;Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;[FLq7/a;I)Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:I

.field public final synthetic d:Lr7/c;

.field public final synthetic e:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;ILr7/c;Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iput p3, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->c:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->d:Lr7/c;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->e:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 10
    .line 11
    iput p6, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->f:I

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Lq7/a;Ljava/lang/String;IZ)V
    .locals 9

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->b:Landroid/view/ViewGroup;

    .line 6
    .line 7
    iget v2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->c:I

    .line 8
    .line 9
    iget-object v3, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->d:Lr7/c;

    .line 10
    .line 11
    iget-object v4, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->e:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 12
    .line 13
    invoke-virtual {p1}, Lq7/a;->d()Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {p1}, Lq7/a;->e()[F

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    iget v8, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;->f:I

    .line 22
    .line 23
    move-object v7, p1

    .line 24
    invoke-static/range {v0 .. v8}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->e(Landroid/content/Context;Landroid/view/ViewGroup;ILr7/c;Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;[FLq7/a;I)Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
