.class public Lu2/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/f;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu2/f;


# direct methods
.method public constructor <init>(Lu2/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu2/f$a;->a:Lu2/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lw2/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/f$a;->a:Lu2/f;

    .line 2
    .line 3
    invoke-static {v0}, Lu2/f;->b(Lu2/f;)Ly2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Ly2/b;->a(Lw2/b$a;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lu2/f$a;->a:Lu2/f;

    .line 11
    .line 12
    invoke-static {p1}, Lu2/f;->d(Lu2/f;)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "track_list"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p1, Lu2/f;->k:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method
