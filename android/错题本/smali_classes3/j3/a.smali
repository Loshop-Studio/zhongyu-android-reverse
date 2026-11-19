.class public final Lj3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/xuexiang/xui/widget/progress/CircleProgressView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/progress/CircleProgressView;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/a;->b:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    .line 5
    .line 6
    iput-boolean p2, p0, Lj3/a;->a:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->z:I

    .line 2
    .line 3
    iget-object v0, p0, Lj3/a;->b:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    .line 4
    .line 5
    iget-boolean v1, p0, Lj3/a;->a:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->a(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
