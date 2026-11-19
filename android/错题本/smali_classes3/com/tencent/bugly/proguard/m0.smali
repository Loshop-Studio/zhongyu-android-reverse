.class public final Lcom/tencent/bugly/proguard/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/util/concurrent/LinkedBlockingQueue;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/bugly/proguard/m0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/tencent/bugly/proguard/m0;->b:I

    iput-object p2, p0, Lcom/tencent/bugly/proguard/m0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPanelView;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/m0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/m0;->c:Ljava/lang/Object;

    iput p2, p0, Lcom/tencent/bugly/proguard/m0;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/bugly/proguard/m0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/m0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 9
    .line 10
    iget v1, p0, Lcom/tencent/bugly/proguard/m0;->b:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget v1, p0, Lcom/tencent/bugly/proguard/m0;->b:I

    .line 18
    .line 19
    if-ge v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/tencent/bugly/proguard/m0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Runnable;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
