.class final Landroidx/compose/ui/autofill/AndroidContentType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/autofill/ContentType;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u0008\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/autofill/AndroidContentType;",
        "Landroidx/compose/ui/autofill/ContentType;",
        "androidAutofillHints",
        "",
        "",
        "(Ljava/util/Set;)V",
        "getAndroidAutofillHints",
        "()Ljava/util/Set;",
        "plus",
        "other",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final androidAutofillHints:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/autofill/AndroidContentType;->androidAutofillHints:Ljava/util/Set;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getAndroidAutofillHints()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/autofill/AndroidContentType;->androidAutofillHints:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public plus(Landroidx/compose/ui/autofill/ContentType;)Landroidx/compose/ui/autofill/ContentType;
    .locals 1

    .line 1
    const-string/jumbo v0, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    check-cast p1, Landroidx/compose/ui/autofill/AndroidContentType;

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/autofill/AndroidContentType;->androidAutofillHints:Ljava/util/Set;

    .line 10
    .line 11
    iget-object p1, p1, Landroidx/compose/ui/autofill/AndroidContentType;->androidAutofillHints:Ljava/util/Set;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/Iterable;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Landroidx/compose/ui/autofill/AndroidContentType;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Landroidx/compose/ui/autofill/AndroidContentType;-><init>(Ljava/util/Set;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
