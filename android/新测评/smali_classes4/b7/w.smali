.class public final synthetic Lb7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lb7/l;

.field public final synthetic c:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/w;->a:Landroid/content/Context;

    iput-object p2, p0, Lb7/w;->b:Lb7/l;

    iput-object p3, p0, Lb7/w;->c:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p4, p0, Lb7/w;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lb7/w;->a:Landroid/content/Context;

    iget-object v1, p0, Lb7/w;->b:Lb7/l;

    iget-object v2, p0, Lb7/w;->c:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v3, p0, Lb7/w;->d:Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->d(Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
