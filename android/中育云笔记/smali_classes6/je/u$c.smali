.class public final Lje/u$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lje/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/u$c$a;
    }
.end annotation


# static fields
.field public static final c:Lje/u$c$a;


# instance fields
.field public final a:Lje/q;

.field public final b:Lje/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lje/u$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lje/u$c$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lje/u$c;->c:Lje/u$c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lje/q;Lje/x;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lje/u$c;->a:Lje/q;

    .line 4
    iput-object p2, p0, Lje/u$c;->b:Lje/x;

    return-void
.end method

.method public synthetic constructor <init>(Lje/q;Lje/x;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lje/u$c;-><init>(Lje/q;Lje/x;)V

    return-void
.end method


# virtual methods
.method public final a()Lje/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/u$c;->b:Lje/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lje/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/u$c;->a:Lje/q;

    .line 2
    .line 3
    return-object v0
.end method
