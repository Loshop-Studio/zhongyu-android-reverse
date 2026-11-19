.class public final Lcom/zykj/message/UnLoginActivity$c;
.super Ld/f/b/e;
.source ""

# interfaces
.implements Ld/f/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/UnLoginActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld/f/b/e;",
        "Ld/f/a/b<",
        "Lb/d/a/d/c/a;",
        "Ld/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/zykj/message/UnLoginActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/message/UnLoginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/UnLoginActivity$c;->b:Lcom/zykj/message/UnLoginActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld/f/b/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lb/d/a/d/c/a;

    const-string v0, "it"

    .line 1
    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p1, Lb/d/a/d/c/a;->b:Lb/d/a/d/c/b;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object p1, Lb/d/a/d/c/b;->c:Lb/d/a/d/c/b;

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/zykj/message/UnLoginActivity$c;->b:Lcom/zykj/message/UnLoginActivity;

    .line 4
    sget v0, Lcom/zykj/message/UnLoginActivity;->q:I

    invoke-virtual {p1}, Lcom/zykj/message/UnLoginActivity;->w()V

    .line 5
    :goto_1
    sget-object p1, Ld/d;->a:Ld/d;

    return-object p1
.end method
