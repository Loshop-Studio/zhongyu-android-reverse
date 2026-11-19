.class public final Lr2/w$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr2/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/w$c$a;
    }
.end annotation


# static fields
.field public static final c:Lr2/w$c$a;


# instance fields
.field public final a:Lr2/s;

.field public final b:Lr2/z;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr2/w$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr2/w$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr2/w$c;->c:Lr2/w$c$a;

    return-void
.end method

.method public constructor <init>(Lr2/s;Lr2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/w$c;->a:Lr2/s;

    iput-object p2, p0, Lr2/w$c;->b:Lr2/z;

    return-void
.end method

.method public synthetic constructor <init>(Lr2/s;Lr2/z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lr2/w$c;-><init>(Lr2/s;Lr2/z;)V

    return-void
.end method


# virtual methods
.method public final a()Lr2/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/w$c;->b:Lr2/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lr2/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/w$c;->a:Lr2/s;

    .line 2
    .line 3
    return-object v0
.end method
