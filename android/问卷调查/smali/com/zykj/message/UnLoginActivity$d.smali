.class public final Lcom/zykj/message/UnLoginActivity$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/UnLoginActivity;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/zykj/message/UnLoginActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/message/UnLoginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/UnLoginActivity$d;->b:Lcom/zykj/message/UnLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/message/UnLoginActivity$d;->b:Lcom/zykj/message/UnLoginActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/zykj/message/UnLoginActivity$d;->b:Lcom/zykj/message/UnLoginActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
