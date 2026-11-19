.class public final synthetic Lg7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Ref$LongRef;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/h;->a:Lkotlin/jvm/internal/Ref$LongRef;

    iput-object p2, p0, Lg7/h;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lg7/h;->a:Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v1, p0, Lg7/h;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lg7/i;->a(Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
