.class public final Lcoil3/util/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil3/util/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final c:Lcoil3/util/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcoil3/util/c$a;

    invoke-direct {v0}, Lcoil3/util/c$a;-><init>()V

    sput-object v0, Lcoil3/util/c$a;->c:Lcoil3/util/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lw/g;)Ljava/lang/Void;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/g;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcoil3/util/c$a;->a(Lw/g;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
