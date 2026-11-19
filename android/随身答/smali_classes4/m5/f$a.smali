.class public final Lm5/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls5/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm5/f;-><init>(Lm5/l;Lb5/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lm5/f;


# direct methods
.method public constructor <init>(Lm5/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm5/f$a;->a:Lm5/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPlayEnd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/f$a;->a:Lm5/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lm5/f;->j(Lm5/f;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPlayPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/f$a;->a:Lm5/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lm5/f;->j(Lm5/f;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPlayResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/f$a;->a:Lm5/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lm5/f;->j(Lm5/f;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPlayStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/f$a;->a:Lm5/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lm5/f;->j(Lm5/f;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onProgress(J)V
    .locals 0

    .line 1
    return-void
.end method
