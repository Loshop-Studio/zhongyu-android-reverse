.class public final Lca/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lca/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lca/b$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lca/b$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lca/b$b;->a:Lca/b$b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Li9/c0;)Li9/c0;
    .locals 0

    .line 1
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li9/c0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lca/b$b;->a(Li9/c0;)Li9/c0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
