.class final Le3/i$a$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le3/i$a;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Ljava/lang/Integer;",
        "Le3/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Le3/i$a;


# direct methods
.method constructor <init>(Le3/i$a;)V
    .locals 0

    iput-object p1, p0, Le3/i$a$a;->a:Le3/i$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Le3/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Le3/i$a$a;->a:Le3/i$a;

    invoke-virtual {v0, p1}, Le3/i$a;->b(I)Le3/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Le3/i$a$a;->a(I)Le3/f;

    move-result-object p1

    return-object p1
.end method
