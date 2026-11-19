.class Lt/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/m;->f([Lz/f$b;I)Lz/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt/m$b<",
        "Lz/f$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lt/m;


# direct methods
.method constructor <init>(Lt/m;)V
    .locals 0

    iput-object p1, p0, Lt/m$a;->a:Lt/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lz/f$b;

    invoke-virtual {p0, p1}, Lt/m$a;->c(Lz/f$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lz/f$b;

    invoke-virtual {p0, p1}, Lt/m$a;->d(Lz/f$b;)Z

    move-result p1

    return p1
.end method

.method public c(Lz/f$b;)I
    .locals 0

    invoke-virtual {p1}, Lz/f$b;->e()I

    move-result p1

    return p1
.end method

.method public d(Lz/f$b;)Z
    .locals 0

    invoke-virtual {p1}, Lz/f$b;->f()Z

    move-result p1

    return p1
.end method
