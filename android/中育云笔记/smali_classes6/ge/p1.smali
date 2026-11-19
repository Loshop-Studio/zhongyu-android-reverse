.class public final synthetic Lge/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lge/r1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lge/r1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge/p1;->c:Ljava/lang/String;

    iput-object p2, p0, Lge/p1;->d:Lge/r1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lge/p1;->c:Ljava/lang/String;

    iget-object v1, p0, Lge/p1;->d:Lge/r1;

    invoke-static {v0, v1}, Lge/r1;->b(Ljava/lang/String;Lge/r1;)Lee/f;

    move-result-object v0

    return-object v0
.end method
