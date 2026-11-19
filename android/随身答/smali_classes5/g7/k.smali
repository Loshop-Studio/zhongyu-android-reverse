.class public final synthetic Lg7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lg7/l;


# direct methods
.method public synthetic constructor <init>(Lg7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/k;->a:Lg7/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lg7/k;->a:Lg7/l;

    invoke-static {v0}, Lg7/l;->g(Lg7/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
