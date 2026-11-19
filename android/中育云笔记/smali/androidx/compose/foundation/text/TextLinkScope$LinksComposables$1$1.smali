.class final Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/TextLinkScope;->LinksComposables(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;

    invoke-direct {v0}, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;->INSTANCE:Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 2

    .line 2
    sget-object v0, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {v0}, Landroidx/compose/ui/semantics/SemanticsProperties;->getLinkTestMarker()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v0

    sget-object v1, Lqc/q;->a:Lqc/q;

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;->set(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V

    return-void
.end method
