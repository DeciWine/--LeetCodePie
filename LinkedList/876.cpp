class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* store[101];
        int count = 0;
        while(head!=NULL){
            store[count] = head;
            head = head->next;
            count++;
        }
        return store[count/2];
    }
};