.class public final synthetic Lj6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lj6/c;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lj6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/i;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lj6/i;->b:Lj6/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lj6/i;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj6/i;->b:Lj6/c;

    invoke-static {v0, v1}, Lj6/o;->d(Lkotlin/jvm/functions/Function1;Lj6/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
