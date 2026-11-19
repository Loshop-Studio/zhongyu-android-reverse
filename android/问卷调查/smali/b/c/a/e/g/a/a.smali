.class public Lb/c/a/e/g/a/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/g/a/a;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/g/a/a;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Lb/c/a/e/g/a/d/b;

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v0

    invoke-interface {v1, v0}, Lb/c/a/e/g/a/d/b;->a(I)V

    return-void
.end method
