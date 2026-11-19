.class public final synthetic Lc7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lc7/c;


# direct methods
.method public synthetic constructor <init>(Lc7/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/q;->a:Lc7/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc7/q;->a:Lc7/c;

    invoke-static {v0}, Lc7/r;->d(Lc7/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
