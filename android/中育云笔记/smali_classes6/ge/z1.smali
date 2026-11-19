.class public final synthetic Lge/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lge/d2;


# direct methods
.method public synthetic constructor <init>(Lge/d2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge/z1;->c:Lge/d2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lge/z1;->c:Lge/d2;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lge/d2;->h(Lge/d2;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
