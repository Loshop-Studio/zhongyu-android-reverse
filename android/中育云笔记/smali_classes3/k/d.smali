.class public final synthetic Lk/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lkotlin/Pair;


# direct methods
.method public synthetic constructor <init>(Lkotlin/Pair;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/d;->c:Lkotlin/Pair;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/d;->c:Lkotlin/Pair;

    invoke-static {v0}, Lcoil3/a$a;->c(Lkotlin/Pair;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
