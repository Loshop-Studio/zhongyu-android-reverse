.class public final Lc9/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lc9/f;


# direct methods
.method public constructor <init>(Lc9/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/m$a;->a:Lc9/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ll8/z;)Ljava/util/Optional;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/m$a;->a:Lc9/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lc9/f;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll8/z;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lc9/m$a;->a(Ll8/z;)Ljava/util/Optional;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
