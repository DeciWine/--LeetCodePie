class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* root = new ListNode(-1);
        root->next = head;
        int count = 0;
        ListNode* p = root;
        ListNode* q = NULL;
        while(p->next!=NULL){
            p=p->next;
            if(q){
                q=q->next;
            }
            count++;
            if(count==n){
                q = root;
            }
        }
        p = q->next;
        q->next=p->next; 
        delete p; 
        return root->next;
    }
};