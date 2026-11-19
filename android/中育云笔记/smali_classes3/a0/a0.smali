.class public final synthetic La0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcoil3/decode/a$a;


# direct methods
.method public synthetic constructor <init>(Lcoil3/decode/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/a0;->c:Lcoil3/decode/a$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La0/a0;->c:Lcoil3/decode/a$a;

    invoke-static {v0}, Lcoil3/util/c;->a(Lcoil3/decode/a$a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
