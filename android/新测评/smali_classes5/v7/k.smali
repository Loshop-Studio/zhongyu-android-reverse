.class public final synthetic Lv7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lv7/l;


# direct methods
.method public synthetic constructor <init>(Lv7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/k;->a:Lv7/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/k;->a:Lv7/l;

    invoke-static {v0}, Lv7/l;->g(Lv7/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
