.class public final synthetic Lh4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lkotlin/jvm/internal/Ref$LongRef;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic e:Lcom/friday/user/view/AboutFragment;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lcom/friday/user/view/AboutFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/d;->c:Lkotlin/jvm/internal/Ref$LongRef;

    iput-object p2, p0, Lh4/d;->d:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p3, p0, Lh4/d;->e:Lcom/friday/user/view/AboutFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lh4/d;->c:Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v1, p0, Lh4/d;->d:Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v2, p0, Lh4/d;->e:Lcom/friday/user/view/AboutFragment;

    invoke-static {v0, v1, v2}, Lcom/friday/user/view/AboutFragment;->r(Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lcom/friday/user/view/AboutFragment;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
